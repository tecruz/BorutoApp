package com.example.borutoapp.domain.usecases

import com.example.borutoapp.domain.usecases.getallheroes.GetAllHeroesUseCase
import com.example.borutoapp.domain.usecases.getselectedhero.GetSelectedHeroUseCase
import com.example.borutoapp.domain.usecases.readonboarding.ReadOnBoardingUseCase
import com.example.borutoapp.domain.usecases.saveonboarding.SaveOnBoardingUseCase
import com.example.borutoapp.domain.usecases.searchheroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
    val getSelectedHeroUseCase: GetSelectedHeroUseCase
)