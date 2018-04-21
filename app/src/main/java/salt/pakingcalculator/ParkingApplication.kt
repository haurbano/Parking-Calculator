package salt.pakingcalculator

import android.app.Application
import com.brianegan.bansa.BaseStore
import salt.pakingcalculator.redux.AppState
import salt.pakingcalculator.redux.middlewares.parkingMiddleware
import salt.pakingcalculator.redux.reducers.parkingReducer

class ParkingApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}

val store = BaseStore(AppState(), parkingReducer, parkingMiddleware)
