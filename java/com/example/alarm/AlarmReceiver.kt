package com.example.alarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.widget.Toast

class AlarmReceiver :BroadcastReceiver()
{
    override fun onReceive(context: Context?, intent: Intent?) {
        val vibrator = context!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
         vibrator.vibrate( milliseconds:4000)
         Toast.makeText(context,"Alarm!!! Wake Up!!!!", Toast.LENGTH_SHORT).show()

        var alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)

        if (alarmUri == null ) {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        }

        val ringtone = RingtoneManager.getRingtone(context,alarmUri)
        ringtone.play()

        

    }
}