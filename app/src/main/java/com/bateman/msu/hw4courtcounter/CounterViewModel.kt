package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"
const val SCORE_TEAM_A_KEY = "SCORE_TEAM_A_KEY"
const val SCORE_TEAM_B_KEY = "SCORE_TEAM_B_KEY"

class CounterViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var scoreTeamA: Int
        get() = savedStateHandle.get(SCORE_TEAM_A_KEY) ?: 0
        set(value) = savedStateHandle.set(SCORE_TEAM_A_KEY, value)

    var scoreTeamB: Int
        get() = savedStateHandle.get(SCORE_TEAM_B_KEY) ?: 0
        set(value) = savedStateHandle.set(SCORE_TEAM_B_KEY, value)

    fun teamAPlusOne() {
        scoreTeamA++
    }

    fun teamAPlusTwo() {
        scoreTeamA += 2
    }

    fun teamAPlusThree() {
        scoreTeamA += 3
    }

    fun teamBPlusOne() {
        scoreTeamB++
    }

    fun teamBPlusTwo() {
        scoreTeamB += 2
    }

    fun teamBPlusThree() {
        scoreTeamB += 2
    }

    fun resetTeamScores() {
        scoreTeamA = 0
        scoreTeamB = 0
    }

}