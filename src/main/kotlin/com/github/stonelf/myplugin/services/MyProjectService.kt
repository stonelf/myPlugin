package com.github.stonelf.myplugin.services

import com.intellij.openapi.project.Project
import com.github.stonelf.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
