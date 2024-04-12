package com.oybekdev.calculator_with_jetpack

sealed class CalculatorOperation(val symbol:String){
    object Add:CalculatorOperation("+")
    object Subtract:CalculatorOperation("-")
    object Multiply:CalculatorOperation("*")
    object Divide:CalculatorOperation("/")
}
