package com.devkick.data.repo.mapper

import com.devkick.data.model.DigimonDetail
import com.devkick.data.model.ListDigimonItem
import com.devkick.data.model.detail.Digimon
import com.devkick.data.model.entity.DigimonEntity
import com.devkick.data.model.list.Content
import javax.inject.Inject

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 12/2/23
 * @desc
 **/
class DigimonMapper @Inject constructor() {
    fun Content.toDomainList(): ListDigimonItem = ListDigimonItem(
        id = id,
        name = name,
        url = image,
        isLike = false
    )

    fun Content.toEntity(): DigimonEntity = DigimonEntity(
        id = id,
        image = image,
    )

    fun Digimon.toDomainDetail(): DigimonDetail {
        val image = images.map { it.href }
        val description = descriptions.first { it.language == "en_us" }.description

        return DigimonDetail(
            id = id,
            name = name,
            image = image,
            description = description,
            skills = skills.map { skill ->
                DigimonDetail.Skill(
                    id = skill.id,
                    skillName = skill.skill,
                    description = skill.description
                )
            },
            priorEvolutions = priorEvolutions.map {
                DigimonDetail.Evolution(
                    id = it.id,
                    digimonName = it.digimon,
                    image = it.url
                )
            },
            nextEvolutions = nextEvolutions.map {
                DigimonDetail.Evolution(
                    id = it.id,
                    digimonName = it.digimon,
                    image = it.url
                )
            }
        )
    }
}