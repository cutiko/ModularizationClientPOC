package cl.cutiko.chats


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import cl.cutiko.chatrepository.Chat
import kotlinx.android.synthetic.main.fragment_chats.*

class ChatsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        demoButton.setOnClickListener {
            val chat = Chat(name = "${System.currentTimeMillis()}")
            val text = "The chat name is ${chat.name}\nClass: $chat"
            (it as? TextView)?.text = text
        }
    }


}
