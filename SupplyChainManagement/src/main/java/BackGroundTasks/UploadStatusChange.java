package BackGroundTasks;

import Data.OutletsLogIdentity;
import Models.OutletLogs;
import Repository.OutletLogsRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UploadStatusChange {
    OutletLogsRepository outletLogs;
    OutletsLogIdentity OutletsLogIdentity;

    UploadStatusChange(OutletLogsRepository outletLogs){
        this.outletLogs = outletLogs;
    }

    /// this method runs once every 24hrs, to set New Transaction
    /// to old (i.e status New to Old).

    @Scheduled(fixedDelay = 86400)
    public void updateAllStatusChange(){
        Iterable<OutletLogs> result = outletLogs.findOutletLogsByStatus("New");
        for (OutletLogs logs : result){
            OutletsLogIdentity = new OutletsLogIdentity(logs.getId(), logs.getIdentity(),
                    logs.getBranchAddress(), logs.getBranchCity(), logs.getBranchName(),
                    logs.getBranchManager(), logs.getTelephone(), logs.getProductName(),
                    logs.getQuantityRemaining(), logs.getAssetValue(), logs.getState(),
                    "Old", logs.getLocalgovernment(), logs.getCountry(),
                    logs.getEmail());

            outletLogs.save(OutletsLogIdentity);
        }
    }
}


