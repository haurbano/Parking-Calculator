package salt.pakingcalculator.redux.middlewares

import com.brianegan.bansa.Middleware
import salt.pakingcalculator.redux.AppState
import salt.pakingcalculator.redux.actions.EndParking
import salt.pakingcalculator.redux.actions.IncrementOneStepTime
import salt.pakingcalculator.redux.actions.StartParking
import salt.pakingcalculator.redux.actions.UpdateCost

val parkingMiddleware = Middleware<AppState>{ store, action, next ->
    when(action){
        is StartParking -> {

        }
        is EndParking   -> {

        }
        is IncrementOneStepTime -> {
            store.dispatch(IncrementOneStepTime)
            val actualCost = store.state.actualTime * store.state.pricePerTime
            store.dispatch(UpdateCost(actualCost))
        }
        else -> next
    }
}