package osh.study.osh.study.shopping_mall.domain.usecase

import osh.study.osh.study.shopping_mall.domain.model.TempModel
import osh.study.osh.study.shopping_mall.domain.repository.TempRepository
import javax.inject.Inject

class TempUseCase @Inject constructor(private val repository: TempRepository) {
    fun getTempModel() : TempModel {

    }
}