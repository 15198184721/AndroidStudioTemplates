package com.github.15198184721.androidstudiotemplates.services

import com.intellij.openapi.project.Project
import com.github.15198184721.androidstudiotemplates.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
