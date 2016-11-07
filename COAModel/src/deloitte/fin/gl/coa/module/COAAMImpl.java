package deloitte.fin.gl.coa.module;

import deloitte.fin.gl.coa.module.common.COAAM;

import deloitte.fin.gl.coa.view.COASearchVOImpl;

import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 02 00:12:33 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class COAAMImpl extends ApplicationModuleImpl implements COAAM {
    /**
     * This is the default constructor (do not remove).
     */
    public COAAMImpl() {
    }

    /**
     * Container's getter for COAMappingRulesVO1.
     * @return COAMappingRulesVO1
     */
    public ViewObjectImpl getCOAMappingRulesVO1() {
        return (ViewObjectImpl)findViewObject("COAMappingRulesVO1");
    }

    /**
     * Container's getter for COASegmentDefinitionsVO1.
     * @return COASegmentDefinitionsVO1
     */
    public ViewObjectImpl getCOASegmentDefinitionsVO1() {
        return (ViewObjectImpl)findViewObject("COASegmentDefinitionsVO1");
    }

    /**
     * Container's getter for COASegmentMappingsVO1.
     * @return COASegmentMappingsVO1
     */
    public ViewObjectImpl getCOASegmentMappingsVO1() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO1");
    }

    /**
     * Container's getter for COASegmentValuesVO1.
     * @return COASegmentValuesVO1
     */
    public ViewObjectImpl getCOASegmentValuesVO1() {
        return (ViewObjectImpl)findViewObject("COASegmentValuesVO1");
    }

    /**
     * Container's getter for COASegmentMappingsVO2.
     * @return COASegmentMappingsVO2
     */
    public ViewObjectImpl getCOASegmentMappingsVO2() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO2");
    }

    /**
     * Container's getter for COASegmentValuesVO2.
     * @return COASegmentValuesVO2
     */
    public ViewObjectImpl getCOASegmentValuesVO2() {
        return (ViewObjectImpl)findViewObject("COASegmentValuesVO2");
    }

    /**
     * Container's getter for COASegmentMappingsVO3.
     * @return COASegmentMappingsVO3
     */
    public ViewObjectImpl getCOASegmentMappingsVO3() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO3");
    }

    /**
     * Container's getter for COASegmentMappingsVO4.
     * @return COASegmentMappingsVO4
     */
    public ViewObjectImpl getCOASegmentMappingsVO4() {
        return (ViewObjectImpl)findViewObject("COASegmentMappingsVO4");
    }


    public void findCOAValues(String sourceSystem,String targetSystem,String mappingRule,String sourceSegment,String targetSegemnt,String sourceValue,String targetValue){
            System.out.println("Source System:"+sourceSystem+
                               "Tatget: "+targetSystem+
                               "Mapping: "+mappingRule+
                               "SourceSegment: "+sourceSegment+
                               "TargetSegemnt: "+targetSegemnt+
                               "SourceValue: "+sourceValue+
                               "TargetValue "+targetValue+"\n");
            
            ViewObjectImpl COAValuesVO = getCOASearchVO1();
        //        tableName = "TableA";
            if (sourceSystem != null||targetSystem !=null||mappingRule !=null||sourceSegment != null||targetSegemnt!=null||sourceValue!=null||targetValue!=null){
            System.out.println("Inside IF Start");
                ViewCriteria vc =
                    COAValuesVO.getViewCriteria("COASearchVOCriteria");
                COAValuesVO.applyViewCriteria(vc);
                COAValuesVO.setNamedWhereClauseParam("p_SourceSystem", sourceSystem);
                COAValuesVO.setNamedWhereClauseParam("p_TargetSystem", targetSystem);
                COAValuesVO.setNamedWhereClauseParam("p_MappingRule", mappingRule);
                //COAValuesVO.setNamedWhereClauseParam("p_SourceSegment", sourceSegment);
                //COAValuesVO.setNamedWhereClauseParam("p_TargetSegment", targetSegemnt);
                COAValuesVO.setNamedWhereClauseParam("p_SourceSegmentValue", sourceValue);
                COAValuesVO.setNamedWhereClauseParam("p_TargetSegmentValue", targetValue);
        //            ciaVO.executeQuery();
        System.out.println("Inside IF END");
            }
            else{
                System.out.println("Inside Else Start");
                ViewCriteria vc = COAValuesVO.getViewCriteria("COASearchVOCriteria");
                COAValuesVO.removeViewCriteria("COASearchVOCriteria");
                vc.resetCriteria();
                COAValuesVO.applyViewCriteria(vc);
        //            ciaVO.executeQuery();
        System.out.println("Inside Else Start");
            }
            
        }


    /**
     * Container's getter for SysC007381Link1.
     * @return SysC007381Link1
     */
    public ViewLinkImpl getSysC007381Link1() {
        return (ViewLinkImpl)findViewLink("SysC007381Link1");
    }

    /**
     * Container's getter for SysC007382Link1.
     * @return SysC007382Link1
     */
    public ViewLinkImpl getSysC007382Link1() {
        return (ViewLinkImpl)findViewLink("SysC007382Link1");
    }

    /**
     * Container's getter for SysC007380Link1.
     * @return SysC007380Link1
     */
    public ViewLinkImpl getSysC007380Link1() {
        return (ViewLinkImpl)findViewLink("SysC007380Link1");
    }

    /**
     * Container's getter for SysC007379Link1.
     * @return SysC007379Link1
     */
    public ViewLinkImpl getSysC007379Link1() {
        return (ViewLinkImpl)findViewLink("SysC007379Link1");
    }

    /**
     * Container's getter for COASearchVO1.
     * @return COASearchVO1
     */
    public COASearchVOImpl getCOASearchVO1() {
        return (COASearchVOImpl)findViewObject("COASearchVO1");
    }

    /**
     * Container's getter for COAFindFieldLOVVO1.
     * @return COAFindFieldLOVVO1
     */
    public ViewObjectImpl getCOAFindFieldLOVVO1() {
        return (ViewObjectImpl)findViewObject("COAFindFieldLOVVO1");
    }
}
