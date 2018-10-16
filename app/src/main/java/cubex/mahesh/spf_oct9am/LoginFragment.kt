package cubex.mahesh.spf_oct9am

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*

class LoginFragment : Fragment( )
{
    override fun onCreateView(inflater: LayoutInflater,
         container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.login,
                container,false)

        view.lregister.setOnClickListener {
            var fManager = activity!!.supportFragmentManager
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,RegistrationFragment())
            tx.commit()
        }

        view.llogin.setOnClickListener {

            var spf = activity!!.getSharedPreferences(
                    "myprfs", Context.MODE_PRIVATE)
            var email = spf.getString("email","no_value")
            var pass = spf.getString("pass","no_value")

            if(email.equals(view.let1.text.toString()) &&
                    pass.equals(view.let2.text.toString()))
            {
                var fManager = activity!!.supportFragmentManager
                var tx = fManager.beginTransaction()
                tx.replace(R.id.frag1,WelcomeFragment())
                tx.commit()
            }else{
                Toast.makeText(activity,
                        "Invalid User...",Toast.LENGTH_LONG).show()
            }

        }


        return  view
    }

}