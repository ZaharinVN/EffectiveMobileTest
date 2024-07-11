package com.karsoft.effectivemobile.presenter.ui.home

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.karsoft.effectivemobile.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToAllTicketsFragment(
    public val arrivalTown: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_allTicketsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("arrivalTown", this.arrivalTown)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToAllTicketsFragment(arrivalTown: String): NavDirections =
        ActionHomeFragmentToAllTicketsFragment(arrivalTown)

    public fun actionHomeFragmentToPlugFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_plugFragment)
  }
}
