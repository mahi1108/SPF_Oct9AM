package cubex.mahesh.spf_oct9am

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.welcome.view.*

class WelcomeFragment : Fragment( )
{
    override fun onCreateView(inflater: LayoutInflater,
         container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.welcome,
                container,false)
        var spf = activity!!.getSharedPreferences(
                "myprfs", Context.MODE_PRIVATE)
        var email = spf.getString("email","no_value")
        view.tv1.text = "Welcome to NIT : $email"
        return  view
    }

}