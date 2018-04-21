package salt.pakingcalculator.redux

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import salt.pakingcalculator.models.TimeStep
import salt.pakingcalculator.store
import java.util.*


data class AppState(val pricePerTime : Long = 0,
                    val startTime: Calendar = Calendar.getInstance(),
                    val endTime: Calendar = Calendar.getInstance(),
                    val timeStep : TimeStep = TimeStep.PER_MINUTE,
                    val actualTime: Long = 0,
                    val actualCost: Long = 0
){

    private val stateChange = PublishSubject.create<AppState>()

    init {
        store.subscribe { stateChange.onNext(it) }
    }

    fun <T> getObservableFor(target : (AppState) -> T) : Observable<T>{
        return stateChange.map(target).distinctUntilChanged()
    }
}