package com.example.preferecefragment;

import android.os.Bundle;

import android.preference.PreferenceFragment;

import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;


public class preferencea extends PreferenceFragment {

    @Override

    public void onCreate(final Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preference);

    }

    //保存按钮信息
    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        //如果“保存个人信息”这个按钮被选中，将进行括号里面的操作
        if("yesno_save_individual_info".equals(preference.getKey())) {
          /* <CheckBoxPreference
                  android:key="yesno_save_individual_info"
                  android:title="是否保存个人信息" />
        <EditTextPreference
                  android:key="individual_name"
                  android:summary="请输入真实姓名"
                  android:title="姓名 " />*/

            //下面yesno_save_individual_info和individual_name对应上面
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference)findPreference("yesno_save_individual_info");
            EditTextPreference editTextPreference = (EditTextPreference)findPreference("individual_name");
            //让editTextPreference和checkBoxPreference的状态保持一致
            editTextPreference.setEnabled(checkBoxPreference.isChecked());
        }
        // TODO Auto-generated method stub
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

}