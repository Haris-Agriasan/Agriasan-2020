package agri_asan.com.agriasan06_12_19;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StartFirebaseAtBoot extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, FirebaseBackgroundService.class));
    }
}
