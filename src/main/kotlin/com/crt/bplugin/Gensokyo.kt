package com.crt.bplugin

import com.google.gson.Gson
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit
import org.bukkit.entity.Player


/**
 * @author chaoruitao
 * @date 2019-07-29
 */
class Gensokyo() : JavaPlugin() {

    //指令名称
    val cmdGensokyo: String = "gensokyo"
    var gson: Gson = Gson()
    val coorsFile: String = "coors.json"
    var coorList = mutableListOf<CoorModel>()
    var playerList = mutableListOf<Player>()


    init {
        val instream = this.javaClass.classLoader.getResourceAsStream(coorsFile)
        if (instream != null) {
            val breader = instream.bufferedReader(Charsets.UTF_8)
            val jsontext = breader.readText()
            coorList = gson.fromJson(jsontext, arrayListOf<CoorModel>().javaClass)
            print(coorList)
        }
    }

    override fun onEnable() {
        super.onEnable()
        logger.info("开始阅读圣经，请扔掉手上的盗版书籍")
        for (player in Bukkit.getServer().onlinePlayers) {

        }
    }

    override fun onLoad() {
        super.onLoad()
    }

    override fun onDisable() {
        super.onDisable()
    }

    override fun onCommand(
        sender: CommandSender?,
        command: Command?,
        label: String?,
        args: Array<out String>?
    ): Boolean {
        if (command?.name.equals(cmdGensokyo, true)) {
            logger.info("yyh是sb")
            return true;
        }
        return false;
    }

    override fun reloadConfig() {
        super.reloadConfig()
    }
}
