package cubex.mahesh.spf_oct9am

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.register.*
import kotlinx.android.synthetic.main.register.view.*

class RegistrationFragment : Fragment( )
{
    override fun onCreateView(inflater: LayoutInflater,
         container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.register,
                container,false)

       view.rregister.setOnClickListener {
           var spf = activity!!.getSharedPreferences("myprfs",
                   Context.MODE_PRIVATE)
           var spe = spf.edit()
           spe.putString("email",view.ret1.text.toString())
           spe.putString("pass",view.ret2.text.toString())
           spe.putString("mno",view.ret3.text.toString())
           spe.putString("gender",view.ret4.text.toString())
           spe.commit()

           var fManager = activity!!.supportFragmentManager
           var tx = fManager.beginTransaction()
           tx.replace(R.id.frag1,LoginFragment())
           tx.commit()


       }

        return  view
    }

}