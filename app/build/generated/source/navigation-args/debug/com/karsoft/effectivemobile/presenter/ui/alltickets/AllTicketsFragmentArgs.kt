package com.karsoft.effectivemobile.presenter.ui.alltickets

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AllTicketsFragmentArgs(
  public val arrivalTown: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("arrivalTown", this.arrivalTown)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("arrivalTown", this.arrivalTown)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AllTicketsFragmentArgs {
      bundle.setClassLoader(AllTicketsFragmentArgs::class.java.classLoader)
      val __arrivalTown : String?
      if (bundle.containsKey("arrivalTown")) {
        __arrivalTown = bundle.getString("arrivalTown")
        if (__arrivalTown == null) {
          throw IllegalArgumentException("Argument \"arrivalTown\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"arrivalTown\" is missing and does not have an android:defaultValue")
      }
      return AllTicketsFragmentArgs(__arrivalTown)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AllTicketsFragmentArgs {
      val __arrivalTown : String?
      if (savedStateHandle.contains("arrivalTown")) {
        __arrivalTown = savedStateHandle["arrivalTown"]
        if (__arrivalTown == null) {
          throw IllegalArgumentException("Argument \"arrivalTown\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"arrivalTown\" is missing and does not have an android:defaultValue")
      }
      return AllTicketsFragmentArgs(__arrivalTown)
    }
  }
}
