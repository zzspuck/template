package com.github.zzspuck.template.services

import com.intellij.openapi.project.Project
import com.github.zzspuck.template.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
