package com.cristianvillamil.platziwallet.ui.commands

import java.lang.RuntimeException

class FileCommandsManager {
    private val commands  : HashMap<String, FileCommand> = HashMap()
    fun  putCommand(commandName: String , fileCommand: FileCommand){
//        commands.put(commandName,fileCommand)
        commands[commandName] = fileCommand
    }

    fun getCommand(commandName: String):FileCommand {
//        commands.get(commandName)
        if(commands.containsKey(commandName)){
            return commands[commandName]!! //asegurarnos que no sea null
        }else{
            throw RuntimeException("Command $commandName no esta registrado")
        }

    }
}