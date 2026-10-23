package id.ac.polbeng.tiarasilvia.appbarexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// Turunan dari Fragment, bukan AppCompatActivity
class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate layout fragment milik Anda
        return inflater.inflate(R.layout.activity_menu_fragment, container, false)
    }
}