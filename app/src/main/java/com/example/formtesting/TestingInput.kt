package com.example.formtesting

object TestingInput {
    /**
     * None of them should be empty
     * Mobile must contain only digits
     * Mobile NO must have exactly 10 digits
     * Password and Confirm must be same
     * Password must have atleast 2 digits
     */
    fun testInput(mobileNo: String, password: String, confirmPassword: String): Boolean {
        if (mobileNo.isEmpty())
            return false
        if (password.isEmpty())
            return false
        if (mobileNo.count { it.isDigit() } != 10)
            return false
        if (confirmPassword != password)
            return false
        if (password.count { it.isDigit() } <2)
            return false
        return true
    }
}