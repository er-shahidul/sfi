<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:form.layout>

    <div class="container" ng-app="sfiFormApp">

        <div class="row" ng-controller="FormHeaderCtrl">
            <div class="col-xs-2">

                <c:if test="${empty company.logo}">
                    <div style="height: 80px; width: 150px; background-color:#e2e1e1; border: 1px solid #707070;"></div>
                </c:if>

                <c:if test="${!empty company.logo}">
                <img src="data:image/jpeg;base64,${companyLogo}" width="200"/>
                </c:if>
            </div>


            <div class="col-xs-7">
                <div id="companyInfoLeft" class="pull-left">
                    <label>Company Name</label>
                    <label>Creation by:</label>
                    <label ng-show="form.createdAt">Creation date:</label>
                    <label ng-show="form.updatedAt">Last updated:</label>
                    <label>Percent complete:</label>
                </div>
                <div id="companyInfoRight">
                    <label>{{ company.name }}</label>
                    <span>{{ form.createdBy }}</span>
                    <span ng-show="form.createdAt">[{{ form.createdAt }}]</span>
                    <span ng-show="form.updatedAt">[{{ form.updatedAt }}]</span>
                    <div class="progress">
                        <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" ng-style="progressClass()">
                            <span class="sr-only">{{ progress() }}% Complete (success)</span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xs-3" id="formActions">
                <div class="formActionsNotice">
                    <span ng-show="daysLeft >= 0 "><big>{{ daysLeft }}</big> days until form is due!</span>
                    <span ng-show="daysLeft < 0" class="dueDate">Oh no! Your form is {{ daysLeft * -1}} days overdue!</span>
                    <br>
                    <a href="mailto:rachel.dierolf@sfiprogram.org" ng-class="{'dueDate':  daysLeft < 0}">Need help?</a>
                </div>
                <span class="glyphicon glyphicon-file print pull-right" aria-hidden="true"
                      tooltip data-container="body" data-title="Print the entire form"
                      ng-click="printAllSection()"></span>
                <span class="glyphicon glyphicon-print print pull-right" aria-hidden="true"
                      tooltip data-container="body" data-title="Print this page only"
                      ng-click="printSection()"></span>
                <button type="button" class="btn pull-right" data-trigger="hover"
                        ng-class="canSubmit() ? 'btn-success' : 'btn-disabled' "
                        ng-click="canSubmit() && submit()" >{{ submitText() }}</button>
            </div>
            <div class="modal fade" id="submit" tabindex="-1" role="dialog" aria-labelledby="submit" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                            <h4 class="modal-title" id="myModalLabel">Confirm Form Submission</h4>
                        </div>
                        <div class="modal-body">
                            Congratulations! Your form is ready for submission.  Keep in mind that once you confirm and submit your form you will only be able to view the form, but not edit it.
                        </div>
                        <div class="modal-footer">
                            <a data-dismiss="modal">Go back and review it</a>
                            <button type="button" class="btn btn-success" ng-click="formSubmit()">Yes, I'm ready. Submit my Form</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div id="formContainer">
                <div id="formNavigation" ng-controller="FormNavigationCtrl">
                    <div class="formMenuItem" ng-click="goStep('cs1')">
                        <div class="circle {{ getClass('cs1') }}">1</div>
                        <span class="circleTxt {{ getClass('cs1') }}">Profile</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs2')">
                        <div class="circle {{ getClass('cs2') }}">2</div>
                        <span class="circleTxt {{ getClass('cs2') }}">Forestland</br> Information</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs4')">
                        <div class="circle {{ getClass('cs4') }}">3</div>
                        <span class="circleTxt {{ getClass('cs4') }}" >Harvest & Reforestation</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs6')">
                        <div class="circle {{ getClass('cs6') }}">4</div>
                        <span class="circleTxt {{ getClass('cs6') }}">Raw Material Supply</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs5')">
                        <div class="circle {{ getClass('cs5') }}">5</div>
                        <!-- V2 <span class="circleTxt {{ getClass('cs5') }}">Research Funding</span> -->
                        <span class="circleTxt {{ getClass('cs5') }}">Research, Conservation & Community</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs3')">
                        <div class="circle {{ getClass('cs3') }}">6</div>
                        <span class="circleTxt {{ getClass('cs3') }}">Research, Conservation & Community</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs7')">
                        <div class="circle {{ getClass('cs7') }}">7</div>
                        <span class="circleTxt {{ getClass('cs7') }}">Emerging Issues</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs8')">
                        <div class="circle {{ getClass('cs8') }}">8</div>
                        <span class="circleTxt {{ getClass('cs8') }}">Market <br/>Survey (new!)</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs9')">
                        <div class="circle {{ getClass('cs9') }}">9</div>
                        <span class="circleTxt {{ getClass('cs9') }}" style="min-width: 96px"> Forest <br/>Management <br/>Standard <br/>Questions (new!)</span>
                    </div>
                    <div class="formMenuItem" ng-click="goStep('cs10')">
                        <div class="circle {{ getClass('cs10') }}">10</div>
                        <span class="circleTxt {{ getClass('cs10') }}" style="min-width: 107px">Fiber <br/>Sourcing <br/> Standard Questions (new!)</span>
                    </div>
                    <div class="first-desc">SFI annual progress report survey</div>
                    <div class="second-desc">Additional questions</div>
                </div>

                <div class="formContent" ui-view="{{ mode }}Container">
                </div>
            </div>
        </div>

    </div>

    <script src="<c:url value='/assets/js/libs/angular.min.js' />"></script>
    <script src="<c:url value='/assets/js/libs/angular-sanitize.min.js'  />"></script>
    <script src="<c:url value='/assets/js/libs/angular-ui-router.min.js'  />"></script>
    <script src="<c:url value='/assets/js/libs/checklist-model.js'  />"></script>
    <script src="<c:url value='/assets/js/libs/angular-strap.min.js'  />"></script>
    <script src="<c:url value='/assets/js/libs/angular-strap.tpl.min.js'  />"></script>
    <script src="<c:url value='/assets/js/libs/angular-file-upload-shim.min.js'  />"></script>
    <script src="<c:url value='/assets/js/libs/angular-file-upload.min.js' />"></script>

    <script src="<c:url value='/assets/partials/ViewTemplate.js' />"></script>



    <script type="text/javascript">

        function camelize(str) {
          return str.replace(/(?:^\w|[A-Z]|\b\w)/g, function(letter, index) {
            return index == 0 ? letter.toLowerCase() : letter.toUpperCase();
          }).replace(/\s+/g, '');
        }

        var sfiV2 = {

            prepareForm : function(formData){

                var form = {};

                for(var i = 1; i<= 10; i++){
                    form['cs' + i] = {
                        isSectionEnabled : true
                    };
                }

                _.each(formData, function(val, key){
                    var match = key.match(/(cs[0-9]*)(.*)/);
                    if(match){

                        var section = match[1];
                        var attr = camelize(match[2]);

                        if(!form[section]){
                            form[section] = {
                                isSectionEnabled : true
                            };
                        }

                        form[section][attr] = val;
                    }else{
                        console.log(key, val);
                        form[key] = val;
                    }

                });

                return form;

            }
        };

        var formData  = ${sfiPpFormData};
        var form = sfiV2.prepareForm(formData);
        var companyData = ${companyData};


        var company = companyData;

    </script>



    <script src="<c:url value='/assets/js/app/app.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormEmergingIssuesCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormFiberSourcingStandardCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormForestlandCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormForestManagementStandardCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormHarvestCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormHeaderCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormMarketSurveyCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormNavigationCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormPartnershipCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormProfileCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormRawMaterialCtrl.js' />"></script>
    <script src="<c:url value='/assets/js/app/controllers/FormResFundingCtrl.js' />"></script>

    <script type="text/javascript">


        var urlData = {companyId : company.id};
        sfiFormApp.run(function($rootScope) {
            $rootScope.mode = "edit";
            $rootScope.company = company;
            $rootScope.unit = company.unit;
            $rootScope.standObjective = "";
            $rootScope.form = form;
            $rootScope.daysLeft = 123;
        });
        sfiFormApp.run(function($rootScope) {
            $rootScope.$form = null;
            $rootScope.isSectionDirty = null;
            $rootScope.$isFormDirty = function(){
                if($rootScope.isSectionDirty){
                    return $rootScope.isSectionDirty();
                }
                if(!$rootScope.$form){
                    return false;
                }
                if(!($rootScope.$form instanceof Array)){
                    return $rootScope.$form.$dirty;
                }
                for(var key in $rootScope.$form){
                    var $form = $rootScope.$form[key];
                    if($form.$dirty){
                        return true;
                    }
                }
                return false;
            }
            $rootScope.$on('$stateChangeStart',
                    function(event, toState, toParams, fromState, fromParams){
                        if($rootScope.$isFormDirty()){
                            if(confirm("Are you want to leave this page ? You have unsaved changes")){
                                $rootScope.$form = null;
                                $rootScope.isSectionDirty = null;
                                return false;
                            }
                            event.preventDefault();
                        }
                    });
        });
    </script>



</t:form.layout>