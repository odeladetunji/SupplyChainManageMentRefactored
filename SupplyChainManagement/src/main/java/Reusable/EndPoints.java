package Reusable;

import Data.ProductsIdentity;
import Data.OutletsLogIdentity;
import Data.WarehouseIdentity;
import Models.*;
import Data.ProcurementRequestIdentity;
import Repository.*;
import lombok.Data;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@ComponentScan
@Data
public class EndPoints {
    OutletLogsRepository outletLogs;
    OutletsLogIdentity OutletsLogIdentity;
    OutletsRepository outletsRepository;
    ProcurementRequestIdentity procurementReq;
    ProductsRepository productsRepository;
    WareHouseRepository wareHouseRepository;
    ReportRepository reportRepository;

    public EndPoints(OutletLogsRepository outletLogs, OutletsLogIdentity OutletsLogIdentity,
                     ProductsRepository productsRepository, WareHouseRepository wareHouseRepository,
                     ReportRepository reportRepository, OutletsRepository outletsRepository){
        this.outletLogs = outletLogs;
        this.productsRepository = productsRepository;
        this.OutletsLogIdentity = OutletsLogIdentity;
        this.wareHouseRepository = wareHouseRepository;
        this.reportRepository = reportRepository;
        this.outletsRepository = outletsRepository;
    }

    public OutletsLogIdentity Reports(){
        Iterable<OutletLogs> result = outletLogs.findOutletLogsByStatus("New");
        for (OutletLogs logs : result){
            OutletsLogIdentity = new OutletsLogIdentity(logs.getId(), logs.getIdentity(),
                    logs.getBranchAddress(), logs.getBranchCity(), logs.getBranchName(),
                    logs.getBranchManager(), logs.getTelephone(), logs.getProductName(),
                    logs.getQuantityRemaining(), logs.getAssetValue(), logs.getState(),
                    logs.getStatus(), logs.getLocalgovernment(), logs.getCountry(),
                    logs.getEmail());
        }

        return OutletsLogIdentity;
    }

    public Boolean procurementRequest(ProcurementRequestIdentity procReq){
        //new ProcurementRequestIdentity();
        try{
            outletLogs.save(new ProcurementRequestIdentity(procReq.getId(), procReq.getIdentity(),
                    procReq.getProduct(), procReq.getQuantity(), procReq.getBranchAddress(),
                    procReq.getBranchCity(), procReq.getBranchLocalGov(), procReq.getBranchState(),
                    procReq.getCountry(), procReq.getDate(), procReq.getTime(), procReq.getStatus(),
                    procReq.getBranchManager(), procReq.getTelephone(), procReq.getPrice(),
                    procReq.getNetPrice()));
        }catch (Exception ex){
            System.out.println("Something went wrong!");
        }

        return true;
    }

    // returns a list of all products available in the database!
    public List<ProductsIdentity> getAllProducts(){
        List<ProductsIdentity> result = new ArrayList<>();
        Iterable<Products> productList = productsRepository.findAll();

        for(Models.Products data : productList){
            /// pupulating result;
            result.add(new ProductsIdentity(data.getId(), data.getIdentity(), data.getName(), data.getQuantity(),
                    data.getUnit_price(), data.getDiscount(), data.getProduct_location(), data.getProduct_type(),
                    data.getMinimum_order(), data.getMinimum_discount_order(), data.getMaximum_order(), data.getType(),
                    data.getIndividual_weight(), data.getLength(), data.getBreath(), data.getHeight(), data.getVolume(),
                    data.getBulkweight(), data.getExpiry_data(), data.getArrival_date(), data.getArrival_time(),
                    data.getArrival_date(), data.getColor(), data.getCategory(), data.getCommon_name(), data.getVersion(),
                    data.getManufacturers_name(), data.getBatch_number(), data.getIso_number(), data.getProduct_line(),
                    data.getSku(), data.getProduction_time(), data.getProduction_number(), data.getFirstpicture(),
                    data.getSecondpicture(), data.getThirdpicture(), data.getFouthpicture(), data.getFifthpicture(),
                    data.getSixturepicture(), data.getSeventhpicture(), data.getEigthpicture(), data.getNinthpicture()));

        }

        return result;
    }

    ArrayList<Warehouse> warehouseLogs = new ArrayList<Warehouse>(){};

    private void computeWareHouseData(String city, String item){
        Iterable<Warehouse> reslt = wareHouseRepository.findByCityAndItem(city, item);
        warehouseLogs.add(((List<Warehouse>) reslt).get(0));
    }

    private void searchWarehouseData(String anItem, ArrayList<String> cities){
        /// return all cities
        for (String aCity : cities) {
            computeWareHouseData(aCity, anItem);
        }
    }

    public List<Warehouse> checkWarehouses(){
        ArrayList<String> variousItems = new ArrayList<String>(){};

        Iterable<Products> result = productsRepository.findAll();

        ArrayList<String> theCities = new ArrayList<String>(){};
        Iterable<Warehouse> rst = wareHouseRepository.findDistinctByCity();

        for(Products param : result){
            variousItems.add(param.getName()); //products
        }

        for (Warehouse param : rst) {
            theCities.add(param.getState()); // adding cities to an array
        }

        for (String anItem: variousItems) {
            searchWarehouseData(anItem, theCities); //called for each item
        }

        return warehouseLogs;

    }

    public boolean addProductToWarehouse(Warehouse product){
        wareHouseRepository.save(product);
        return true;
    }

    public boolean subtractProductFromWarehouse(Warehouse product){
        wareHouseRepository.save(product);
        return true;
    }

    public boolean submitReport(Reports reports){
        reportRepository.save(reports);
        return true;
    }

    public Iterable<Reports> lastReports(){
        Iterable<Reports> result = reportRepository.findReportsByStatus("New");
        return result;
    }

    public void getSpecificOutlet(){
        Iterable<Outlets> theOutlets = outletsRepository.findOutletsByBranchIdentity()
    }

    public ArrayList<String> missingReports(){
        Iterable<Reports> result = reportRepository.findReportsByStatus("New");
        ArrayList<String> branches = new ArrayList<String>(){};

        if (((List<Reports>) result).size() == 0){
            return branches;
        }

        for (Reports item: result) {
            branches.add(item.getBranchIdentity());
        }

        ArrayList<Outlets> outletsContainer = new ArrayList<Outlets>(){}

        for (String param: branches) {

        }


        return result;
    }

    public List<Reports> reportHistory(){
        Iterable<Reports> result = reportRepository
    }

    public List<Reports> reportHistoryIsGreater(){

    }

    public List<Reports> reportHistoryIsLess(){

    }

    public List<Reports> reportHistoryIsRange(){

    }

}
