package salt.pakingcalculator.redux.reducers

import com.brianegan.bansa.Reducer
import salt.pakingcalculator.redux.AppState
import salt.pakingcalculator.redux.actions.*


val parkingReducer = Reducer<AppState>{ state, action ->
    when(action){
        is UpdateStartTime      -> {state.copy(startTime = action.startTime)}
        is UpdateEndTime        -> {state.copy(endTime = action.endTime)}
        is ChangeStepTime       -> {state.copy(timeStep = action.stepTime)}
        is UpdateCost           -> {state.copy(actualCost = action.cost)}
        is UpdatePricePerTime   -> {state.copy(pricePerTime = action.pricePerTime)}
        else -> state
    }
}