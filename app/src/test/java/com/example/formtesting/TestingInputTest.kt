package com.example.formtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TestingInputTest{
    @Test
    fun mobileNoIsEmpty_returnFalse(){
        val result = TestingInput.testInput("","Test1234","Test1234")
        assertThat(result).isFalse()
    }

    @Test
    fun passwordIsEmpty_returnFalse(){
        val result = TestingInput.testInput("7894612371","","")
        assertThat(result).isFalse()
    }

    @Test
    fun mobileNoIsLess_returnFalse(){
        val result = TestingInput.testInput("789461123","Test1234","Test1234")
        assertThat(result).isFalse()
    }

    @Test
    fun passwordsAreDifferent_returnFalse(){
        val result = TestingInput.testInput("7894612371","Test1234","Test123")
        assertThat(result).isFalse()
    }

    @Test
    fun passwordHasLessDigit_returnFalse(){
        val result = TestingInput.testInput("7894612371","Testing","Testing")
        assertThat(result).isFalse()
    }
}