package com.github.marcodestefani.gitlabplugin.factories

import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import swing.GitHubHomeInterface

class GitlabWindowBaseFactory : ToolWindowFactory, DumbAware {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val myToolWindow = GitHubHomeInterface(toolWindow)
        val contentFactory = ContentFactory.SERVICE.getInstance()
        val content = contentFactory.createContent(myToolWindow.content, "", false)
        toolWindow.contentManager.addContent(content)
    }
}