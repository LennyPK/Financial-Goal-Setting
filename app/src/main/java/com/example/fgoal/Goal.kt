package com.example.financialgoals

import java.math.BigDecimal
import java.util.*

class Goal (var name : String, var cost : BigDecimal?, var weight : Int, var startDate : Date, var endDate: Date) {

    // set and get goal name
    fun setGoalName(newName : String) {
        this.name = newName
    }
    fun getGoalName() : String {
        return this.name
    }

    // set and get goal cost
    fun setGoalCost(newCost : BigDecimal?) {
        this.cost = newCost
    }
    fun getGoalCost() : BigDecimal? {
        return this.cost
    }

    // set and get goal weight
    fun setGoalWeight(newWeight : Int) {
        this.weight = newWeight
    }
    fun getGoalWeight() : Int {
        return this.weight
    }

    // set and get goal start
    fun setGoalStart(newStart : Date) {
        this.startDate = newStart
    }
    fun getGoalStart() : Date {
        return this.startDate
    }

    // set and get goal end
    fun setGoalEnd(newEnd : Date) {
        this.endDate = newEnd
    }
    fun getGoalEnd() : Date {
        return this.endDate
    }

    var list = arrayListOf<Goal>()

}