package com.salesforce.ant;
import com.salesforce.ant.DeployTask;
public class DeployPurge extends DeployTask
{
    public DeployPurge()
    {
        this.deployOptions.setPurgeOnDelete(false);
    }

    public void setPurgeOnDelete(boolean purgeOnDelete) 
    {
        this.deployOptions.setPurgeOnDelete(purgeOnDelete);
    }
}
