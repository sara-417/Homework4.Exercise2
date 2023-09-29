package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.ViewModel

private const val TAG = "CounterViewModel"


class CounterViewModel : ViewModel() {

    var scoreTeamA = 0
    var scoreTeamB = 0

    fun TeamAPlusOne() {
        scoreTeamA++
    }

    fun TeamAPlusTwo() {
        scoreTeamA += 2
    }

    fun TeamAPlusThree() {
        scoreTeamA += 3
    }

    fun TeamBPlusOne() {
        scoreTeamB++
    }

    fun TeamBPlusTwo() {
        scoreTeamB += 2
    }

    fun TeamBPlusThree() {
        scoreTeamB += 2
    }

    fun resetTeamScores() {
        scoreTeamA = 0
        scoreTeamB = 0
    }

}