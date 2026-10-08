package com.masrofy.app.ui

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.masrofy.app.model.Currencies
import com.masrofy.app.model.Languages
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "masrofy_settings")

class SettingsManager(private val context: Context) {

    private val DARK_MODE = booleanPreferencesKey("dark_mode")
    private val LANGUAGE_CODE = stringPreferencesKey("language_code")
    private val CURRENCY_CODE = stringPreferencesKey("currency_code")

    val isDarkMode: Flow<Boolean> = context.dataStore.data.map { it[DARK_MODE] ?: false }

    val languageCode: Flow<String> = context.dataStore.data.map { it[LANGUAGE_CODE] ?: Languages.default.code }

    val currencyCode: Flow<String> = context.dataStore.data.map { it[CURRENCY_CODE] ?: Currencies.default.code }

    suspend fun setDarkMode(enabled: Boolean) {
        context.dataStore.edit { it[DARK_MODE] = enabled }
    }

    suspend fun setLanguage(code: String) {
        context.dataStore.edit { it[LANGUAGE_CODE] = code }
    }

    suspend fun setCurrency(code: String) {
        context.dataStore.edit { it[CURRENCY_CODE] = code }
    }
}
