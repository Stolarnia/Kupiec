package ui;

public abstract class AbstractUIFramework implements UIFramework {
    protected UserStatsProvider userStatsProvider;

    @Override
    public void setUserStatsProvider(UserStatsProvider userStatsProvider) {
        this.userStatsProvider = userStatsProvider;
    }
}
