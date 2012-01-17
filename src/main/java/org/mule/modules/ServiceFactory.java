/**
 * Mule GitHub Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CollaboratorService;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.service.DeployKeyService;
import org.eclipse.egit.github.core.service.DownloadService;
import org.eclipse.egit.github.core.service.GistService;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.LabelService;
import org.eclipse.egit.github.core.service.MilestoneService;
import org.eclipse.egit.github.core.service.TeamService;
import org.eclipse.egit.github.core.service.UserService;
import org.eclipse.egit.github.core.service.WatcherService;

public class ServiceFactory {

    private static final String BASE_URL = "api.github.com";
    private static IssueService defaultIssueService;
    private static WatcherService defaultWatcherService;
    private static CollaboratorService defaultCollaboratorService;
    private static CommitService defaultCommitService;
    private static DeployKeyService defaultDeployKeyService;
    private static DownloadService defaultDownloadService;
    private static GistService defaultGistService;
    private static LabelService defaultLabelService;
    private static MilestoneService defaultMilestoneService;
    private static UserService defaultUserService;
    private static TeamService defaultTeamService;

    public static IssueService getIssueService(String user, String password) {
        if (defaultIssueService != null) {
            return defaultIssueService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new IssueService(client);
    }

    public static WatcherService getWatcherService(String user, String password) {
        if (defaultWatcherService != null) {
            return defaultWatcherService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new WatcherService(client);
    }

    public static CommitService getCommitService(String user, String password) {
        if (defaultCommitService != null) {
            return defaultCommitService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new CommitService(client);
    }

    public static CollaboratorService getCollaboratorService(String user, String password) {
        if (defaultCollaboratorService != null) {
            return defaultCollaboratorService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new CollaboratorService(client);
    }

    public static DeployKeyService getDeployKeyService(String user, String password) {
        if (defaultDeployKeyService != null) {
            return defaultDeployKeyService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new DeployKeyService(client);
    }

    public static DownloadService getDownloadService(String user, String password) {
        if (defaultDownloadService != null) {
            return defaultDownloadService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new DownloadService(client);
    }

    public static GistService getGistService(String user, String password) {
        if (defaultGistService != null) {
            return defaultGistService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new GistService(client);
    }

    public static LabelService getLabelService(String user, String password) {
        if (defaultLabelService != null) {
            return defaultLabelService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new LabelService(client);
    }

    public static MilestoneService getMilestoneService(String user, String password) {
        if (defaultMilestoneService != null) {
            return defaultMilestoneService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new MilestoneService(client);
    }

    public static UserService getUserService(String user, String password) {
        if (defaultUserService != null) {
            return defaultUserService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new UserService(client);
    }

    public static TeamService getTeamService(String user, String password) {
        if (defaultTeamService != null) {
            return defaultTeamService;
        }
        GitHubClient client = new GitHubClient(BASE_URL);
        client.setCredentials(user, password);
        return new TeamService(client);
    }

    public static void setDefaultIssueService(IssueService defaultIssueService) {
        ServiceFactory.defaultIssueService = defaultIssueService;
    }

    public static void setDefaultWatcherService(WatcherService defaultWatcherService) {
        ServiceFactory.defaultWatcherService = defaultWatcherService;
    }

    public static void setDefaultCollaboratorService(CollaboratorService defaultCollaboratorService) {
        ServiceFactory.defaultCollaboratorService = defaultCollaboratorService;
    }

    public static void setDefaultCommitService(CommitService defaultCommitService) {
        ServiceFactory.defaultCommitService = defaultCommitService;
    }

    public static void setDeployKeyService(DeployKeyService defaultDeployKeyService) {
        ServiceFactory.defaultDeployKeyService = defaultDeployKeyService;
    }

    public static void setDownloadService(DownloadService defaultDownloadService) {
        ServiceFactory.defaultDownloadService = defaultDownloadService;
    }

    public static void setGistService(GistService defaultGistService) {
        ServiceFactory.defaultGistService = defaultGistService;
    }

    public static void setLabelService(LabelService defaultLabelService) {
        ServiceFactory.defaultLabelService = defaultLabelService;
    }

    public static void setMilestoneService(MilestoneService defaultMilestoneService) {
        ServiceFactory.defaultMilestoneService = defaultMilestoneService;
    }

    public static void setDefaultUserService(UserService defaultUserService) {
        ServiceFactory.defaultUserService = defaultUserService;
    }

    public static void setDefaultTeamService(TeamService defaultTeamService) {
        ServiceFactory.defaultTeamService = defaultTeamService;
    }
}