package com.github.marcodestefani.gitlabplugin.services

import com.intellij.openapi.project.Project
import com.github.marcodestefani.gitlabplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
