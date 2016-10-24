package com.zz.quicknews.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.zz.quicknews.R;

/**
 * Created by yuchenfw on 2016/8/17.
 */
public class NetWorkState {
    /*private Context mContext;

    public NetWorkState(Context context) {
        mContext = context;
    }
*/
    public static boolean isConn(Context context){
        boolean bisConnFlag;
        ConnectivityManager conManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo network = conManager.getActiveNetworkInfo();
        if(network!=null){
            if (!network.isAvailable()){
                Toast.makeText(context,"当前网络不可用，请检查网络",Toast.LENGTH_SHORT).show();
            }else if (!network.isConnectedOrConnecting()){
                Toast.makeText(context,"当前网络未连接或连接失败，请检查网络",Toast.LENGTH_SHORT).show();
            }else {
                switch (network.getType()) {
                    case ConnectivityManager.TYPE_WIFI:
                        Toast.makeText(context, "您当前处于wifi网络，请放心使用", Toast.LENGTH_SHORT).show();
                        break;
                    case ConnectivityManager.TYPE_MOBILE:
                        Toast.makeText(context, "您当前处于手机网络，请注意流量使用，使用Wifi更流畅哦", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
            bisConnFlag=conManager.getActiveNetworkInfo().isAvailable();
        }else {
            showNoNetWorkDlg(context);
            bisConnFlag=false;
        }
        return bisConnFlag;
    }

    /**
     * 当判断当前手机没有网络时选择是否打开网络设置
     */
    public static void showNoNetWorkDlg(final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.mipmap.ic_launcher)         //
                .setTitle(R.string.app_name)            //
                .setMessage("当前无网络").setPositiveButton("设置", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // 跳转到系统的网络设置界面
                Intent intent ;
                // 先判断当前系统版本
                if(android.os.Build.VERSION.SDK_INT > 10){  // 3.0以上
                    intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                }else{
                    intent = new Intent();
                    intent.setClassName("com.android.settings", "com.android.settings.WirelessSettings");
                }
                context.startActivity(intent);

            }
        }).setNegativeButton("知道了", null).show();
    }
}
