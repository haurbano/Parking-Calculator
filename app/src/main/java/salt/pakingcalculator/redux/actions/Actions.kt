package salt.pakingcalculator.redux.actions

import com.brianegan.bansa.Action
import salt.pakingcalculator.models.TimeStep
import java.util.*

data class StartParking(val startTime : Calendar = Calendar.getInstance()) :Action
data class ChangeStepTime(val stepTime : TimeStep) : Action
data class EndParking(val endTime : Calendar = Calendar.getInstance()): Action
data class UpdateCost(val cost: Long) : Action
data class UpdateStartTime(val startTime: Calendar = Calendar.getInstance()) : Action
data class UpdateEndTime(val endTime : Calendar = Calendar.getInstance()) : Action
data class UpdatePricePerTime(val pricePerTime: Long): Action
object IncrementOneStepTime :Action
