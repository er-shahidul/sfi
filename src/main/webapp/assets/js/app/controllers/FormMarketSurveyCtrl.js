var cs8;
sfiFormApp.controller('FormMarketSurveyCtrl',
    ['$rootScope', '$scope', 'Countries',  '$http', '_', 'Message',
        function ($rootScope , $scope, Countries, $http, _ , Message){

        $scope.cs8 = {} ;
        $scope.cs8Data = angular.copy($rootScope.form.cs8);

        _.each($scope.cs8Data, function(val){
            $scope.cs8 = _.extend($scope.cs8, val);
        });

        $scope.formData = function(){

            _.each($scope.cs8Data, function(object, key){

                _.each(object, function(val, key){
                    object[key] = $scope.cs8[key];
                });

            });

            return $scope.cs8Data;
        };

        $scope.cs8.primaryProducers = $scope.cs8.primaryProducers || [];

        $scope.producer = {};
        $scope.producerIndex = null;


        $scope.producers = [
            "Anthony Forest Products",
            "Bear Island Paper Company WB LLC",
            "Bind-Rite Services, Inc.",
            "Bio-Pappel International, Inc.",
            "Blue Ridge Printing",
            "BOCA Systems",
            "Boehmer Box LP dba Canampac dba LYFT Visual",
            "Bois Expansion Inc.",
            "Boise Cascade Company",
            "Boise Paper Holdings, LLC",
            "Boscus Canada Inc.",
            "Boss Litho, Inc.",
            "Boutwell, Owens & Co. Inc.",
            "BOXES R US, INC. dba ULTIMATE PAPERBOX CO",
            "BPG Graphic Solutions dab Mi5 Print and Digital Co",
            "BPM, Inc.",
            "Bradford & Bigelow",
            "Bridge View Paper Company",
            "Briggs & Stratton",
            "BSC Acquisition Sub, LLC, dba Double Envelope, Con",
            "BUILDING PRODUCTS PLUS LLC",
            "Burd and Fletcher",
            "Burrows Paper Corporation",
            "Burton & Mayer Inc.",
            "BUYSEASONS, Inc.",
            "C & S Press Inc.",
            "C&B Display Packaging Inc.",
            "C&D Lumber Co.",
            "C.J. Duffey Paper Company",
            "C.W. Zumbiel Company, The",
            "Cadmus Communications A Cenveo Company",
            "Cadmus Journal Services dba Cenveo Publisher Servi",
            "Cal-Tex Lumber Company, Inc.",
            "Canadian Wood Products - MontrÃ©al Inc.",
            "Canfor Southern Pine",
            "Canyon Lumber Co., Inc.",
            "Capital Corrugated & Carton dba Sierra Sheets",
            "Capital Printing",
            "Caraustar Industries Inc.",
            "CARAUSTAR TAMA PAPERBOARD",
            "Cardinal Color Print",
            "CardPak, Inc.",
            "Carolina Container Company",
            "CartonCraft, Inc.",
            "Case Paper Company Inc",
            "Catalyst Paper Corporation",
            "CDS Global",
            "Cedar Creek",
            "Center for Forest and Wood Certification",
            "Central Florida Press",
            "Central Group, The",
            "Central Michigan Hardwoods",
            "Central Michigan Paper Company",
            "Central National-Gottesman, Inc.",
            "Cenveo Cadmus - Port City Press",
            "Cenveo Commercial Envelope Manufacturing",
            "Cenveo Corporation",
            "Cenveo McLaren Morris & Todd Company",
            "Cenveo-Toledo",
            "Champion Container Corporation",
            "Chartpak, Inc.",
            "Chicago Press Corporation",
            "Chroma Graphics, Inc.",
            "Circle Incorporated",
            "CJK Print Possibilities",
            "Clampitt Paper Company",
            "Clark's Hardwood Lumber Co., L.P.",
            "Classic Color, Inc.",
            "Classic Envelope Inc",
            "Clearwater Paper Corporation",
            "Clearwater Paper Corporation - AR",
            "Clearwater Paper Corporation - Lewiston",
            "Clifford Paper Inc. dba Media Solutions also tradi",
            "Clondalkin Pharma & Healthcare",
            "Coating Excellence International, LLC",
            "Cogent Fibre Inc.",
            "Colad Group LLC, The",
            "Colbert Packaging Corporation",
            "Collinsville Printing",
            "Collum's Lumber Products, LLC",
            "Colonial Press international, Inc.",
            "ColorGraphics",
            "Colortree Group, Inc.",
            "Columbus Productions",
            "Comet School Supplies",
            "Command Web Missouri",
            "Commencement Bay Corrugated",
            "COMMERCIAL LUMBER AND PALLET COMPANY INC",
            "Compass Packaging LLC",
            "Connemara Converting",
            "Container Service Corp",
            "Continental Accessory Corp.",
            "Conversion Millennium (2003) Inc.",
            "Copap Inc. DBA Copap Trading Inc.",
            "Copy General Corporation",
            "Core Communications",
            "Corpap Inc",
            "CorrChoice",
            "Corrugated Supplies, LLC",
            "Coveris Flexibles US, LLC",
            "Craftmaster Printers, Inc.",
            "Creative Press Inc.",
            "Creel Printing and Publishing, Inc.",
            "CRT, Custom Products, Inc.",
            "Crusader Paper Company",
            "CTP Cartons and Labels â€“ A division of CTP Limited",
            "Cultech, Inc. A Subsidiary of Autajon Group",
            "Curtis Packaging",
            "Cutting Edge Paper Limited",
            "CV Studio",
            "DanHil Containers II, LTD.",
            "Daniels Business Services, Inc. dba Daniels Graphi",
            "Daniels Woodcarving Co., Inc",
            "DART CONTAINER CORPORATION",
            "Dartmouth Printing Company",
            "Data Reproductions",
            "Datatel Resources Corporation",
            "Dee Paper Box Company",
            "Deline Box Company",
            "Delta Corrugated Paper Products",
            "Democrat Printing & Lithographing Co.",
            "DG3 North America, Inc.",
            "DIAMOND ENVELOPE CORPORATION",
            "Direction Furniture Company Inc.",
            "DISC Graphics, Inc.",
            "Display Pack Inc.",
            "District Creative Printing Inc.",
            "Dixie Pulp and Paper, Inc.",
            "Dixon Direct",
            "Dobi & Associates, Inc.",
            "Documation LLC",
            "Dolce Brothers Printing, Inc.",
            "Dominion Holdings, Inc. DBA Source 4",
            "Domtar Paper Company LLC",
            "Double H Plastics, Inc.",
            "Drax Biomass Inc.",
            "Drax Biomass Inc.",
            "DreamWorks Graphic Communications, LLC",
            "Drummond Press, The",
            "DS Graphics Inc.",
            "DST Output LLC",
            "Dual Graphics, Inc.",
            "Dura-Fibre, LLC",
            "Durgin and Crowell Lumber Co., Inc.",
            "Duro Hilex Poly, LLC, a subsidiary of Novolex Hold",
            "Eagle Veneer, Inc.",
            "EarthColor, Inc.",
            "Edison Lithograph & Printing",
            "Edwards Brothers Malloy",
            "Edwards Wood Products",
            "Ekman and Co Inc",
            "El Dorado Packaging, Inc.",
            "ElandersUSA, LLC",
            "Elk Designs Incorporated",
            "Elk Grove Graphics",
            "Ellis Packaging Limited",
            "Ellis Packaging West Inc.",
            "Ellis Paper Box Inc.",
            "Elopak Canada Inc.",
            "Emballages Netpak Inc.",
            "Emballages Stuart Packaging Inc.",
            "EMPIRE CONTAINER CORP",
            "ENAP, Inc.",
            "Endura Products, Inc.",
            "Ennis-Leipsic",
            "Envelope 1, Inc.",
            "Envision Graphics, dba Envision3",
            "Enviva Holdings LP",
            "Enviva Holdings LP",
            "EU Services",
            "Everest Expedition, LLC, dba The Worden Company an",
            "Everett Graphics",
            "Evergreen Packaging, Inc.",
            "Evergreen Packaging, Inc.",
            "Expera Specialty Solutions, LLC",
            "Expera Specialty Solutions, LLC",
            "F.H. Stoltze Land & Lumber Company",
            "FCL Graphics",
            "Fellowes, Inc.",
            "Ferguson Box",
            "Fibercorr Mills, LLC",
            "FiberMark North America, Inc.",
            "Fibre Source International Corp./Fibre Source Nort",
            "Fibreco Export Inc.",
            "FIBRO SOURCE USA, INC.",
            "Field Paper Company",
            "Fifth Third Bank",
            "Financial Graphic Service, Inc.",
            "Finch Paper LLC",
            "First Edge Solutions",
            "Five Star Sheets LLC",
            "Fleetwood Fibre Packaging & Graphics",
            "Flower City Printing",
            "FoldedPak, Inc.",
            "Foremost Graphics LLC",
            "Forest City Trading Group, LLC",
            "FORMULARIOS DE MEXICO, S.A. DE C.V.",
            "Forney Coated Products a division of Smurfit Kappa",
            "Forum Communications Printing",
            "Franklin Press Inc.",
            "Freedom Graphics Systems",
            "French Paper",
            "Garvey Group, The",
            "Gateway Packaging Company",
            "Gateway Press, Inc.",
            "GEORGE CORIATY DBA SIR SPEEDY PRINTING",
            "George H. Dean Company",
            "Georgia Biomass LLC",
            "Georgia Biomass LLC",
            "Georgia-Pacific Corrugated LLC",
            "Georgia-Pacific LLC",
            "Glatfelter - Wood Division",
            "Glatfelter Chillicothe Woodlands",
            "Globus Printing and Packaging",
            "Glover Corporation",
            "GLS Companies",
            "GM Wood Products",
            "Goetz Printing Company, The",
            "Gould Paper Corp.",
            "GP Cellulose GmbH",
            "Grand Traverse Container, Inc.",
            "GRAPH-PAK CORPORATION",
            "Graphic Communications",
            "Graphic Communications Corporation",
            "Graphic Packaging International",
            "Graphic Visual Solutions",
            "Great Atlantic Graphics, Inc.",
            "Great Lakes Packaging Corporation",
            "Great Little Box Company",
            "Great Northern Corporation",
            "Greatview Aseptic Packaging (Shandong)Co., Ltd./Gr",
            "Greatview Beijing Trading Co., Ltd",
            "Greatview Holdings Limited",
            "Green Bay Packaging Inc.",
            "GREENER PLANET, LLC",
            "Greif Packaging, LLC",
            "Greif Packaging, LLC",
            "Grupo IFM",
            "Grupo Infagon",
            "GRUPO PAPELERO SCRIBE S.A. DE C.V.",
            "H.W. Culp Lumber Company",
            "Hallmark Cards Inc",
            "Hampden Papers",
            "Hampton Resources, Inc.",
            "Hankins, Inc.",
            "Harden Furniture, Inc.",
            "Harmony Press Inc. D/B/A Harmony Marketing Group",
            "Harris Packaging Corporation",
            "Hartford City Paper LLC",
            "Hasbro, Inc.",
            "HAWKEYE CORRUGATED BOX",
            "Hazen Paper Company",
            "Heinrich Envelope Corporation",
            "Herzog Veneers",
            "Hexacomb Corporation, a PCA Brand",
            "Highland Craftsman",
            "HighRoad Press LLC",
            "HM Graphics",
            "HM Woodworking",
            "Hobby Press, Inc. DBA Executive Printers of Florid",
            "Hoff Enterprises Inc.",
            "Hoffmaster Group, Inc.Â®",
            "Holmberg Co. Inc.",
            "Homan Industries",
            "Hood Container Corporation",
            "Hood Container Corporation",
            "Hood Industries, Inc.",
            "Hood Packaging Corporation",
            "Horizon Printing",
            "HOT d/b/a EMI Enterprises d/b/a Envelope Mart",
            "Howe Sound Pulp & Paper Corporation",
            "Hub Folding Box Co., Inc.",
            "Huber Engineered Woods, LLC",
            "Huhtamaki, Inc.",
            "Huston Patterson Corporation/ Sigma Graphics",
            "Hutchison-Allgood Printing Co.",
            "Hylton Paper Company, Inc.",
            "iBox Packaging Ltd.",
            "IBS Direct",
            "Idaho Forest Group, LLC",
            "Idaho Forest Group, LLC",
            "Idaho Timber, LLC",
            "Ideal",
            "Imagesmith",
            "IMEX Credit LLC, dba IMEX PAPER",
            "Imperial Lithographing",
            "Impressions Incorporated",
            "Imprimerie Lebonfon Inc.",
            "Imprimerie PUB CITE",
            "Imprimerie Solisco Inc.",
            "Independence Corrugated LLC",
            "Independent II, LLC",
            "Independent Paperboard Marketing",
            "Infinity Global",
            "Innovative Designs, LLC",
            "Integrated Print & Graphics Inc.",
            "Integrity Graphics",
            "Intercarton, S. de R.L. de C.V.",
            "Interfor (formerly Tolleson Lumber LLC)",
            "International ESP, Inc.",
            "International Institute for Learning, Inc.",
            "International Paper Company",
            "International Paper Foodservice Business",
            "International Paperbox",
            "Interprint Web Printing",
            "Interstate Container Reading LLC",
            "Interstate Paper LLC",
            "Irving Tissue Company",
            "Island Container Corp",
            "ITW Laminations",
            "Ivex Specialty Paper, LLC",
            "J&A Printing",
            "J.D. Irving Limited",
            "Jackson Paper Manufacturing Company",
            "Japs-Olson Company",
            "Jasper Lumber Company/ Southern Wood Chips",
            "Jay Packaging Group, Inc.",
            "JBM Envelope Company",
            "JELD-WEN Windows and Doors",
            "Jimmy Whittington Lumber",
            "JJ Collins Printers, Inc.",
            "Joe N. Miles and Sons, Inc.",
            "Joe Piper Inc.",
            "John Roberts Company, The",
            "Johns Manville",
            "JohnsByrne",
            "Johnson Brothers Lumber",
            "Johnson/Anderson and Associates",
            "Jones Packaging Inc.",
            "Jordan Lumber & Supply, Inc.",
            "Jordan Lumber & Supply, Inc.",
            "Jostens Inc.",
            "Justman Packaging and Display",
            "K & D Graphics, Printing and Packaging",
            "K 1 Packaging Group",
            "Kanzaki Specialty Papers, Inc.",
            "KapStone Paper and Packaging Corporation",
            "Katahdin Forest Management LLC",
            "Kaweah Container",
            "KDM Enterprises LLC",
            "Kempf Paper Corporation",
            "Kennickell Print",
            "KEY CONTAINER CORPORATION",
            "King Forest Industries, Inc.",
            "King Printing Company, Inc.",
            "Kingery Printing",
            "Kirkwood Printing Company",
            "KORAB USA, LLC",
            "KPAQ Industries, LLC",
            "Kruger Inc. - Emballages KRUPACK",
            "KyKenKee, Inc.",
            "KyKenKee, Inc.",
            "Lacorr Packaging",
            "Lake Book Manufacturing",
            "Lakeland Paper Corporation",
            "Lampe & Malphrus Lumber Company",
            "Lane Press, The",
            "Langston Companies Inc.",
            "Larson Juhl US LLC",
            "Las Vegas Color Graphics",
            "Lauterbach Group",
            "Lee Industries, Inc.",
            "Lefavor Envelope Company",
            "LeNoble Lumber Co., Inc.",
            "LES BOIS DU FJORD INC.",
            "Les Papiers Atlas Inc.",
            "Lewis Paper",
            "Liberty Carton Company-Metro",
            "Liberty Paper",
            "Lifetouch Services, Inc.",
            "Lightning Source Inc.",
            "Lincoln Paper and Tissue",
            "Lincoln Paper and Tissue",
            "Lindsay Paper Box Co., LTD, The",
            "Little Rapids Corporation",
            "Love Envelopes, Inc.",
            "Loyola Paper",
            "M.P.I. Moulin a papier de Portneuf",
            "Mac Papers, Inc.",
            "MACKAYMITCHELL ENVELOPE COMPANY",
            "Madison Paper Industries, a UPM Group Company",
            "Madison Paper Industries, a UPM Group Company",
            "Malnove Holding Company Corp. Purchasing",
            "Manchester Industries",
            "Mansir Printing LLC",
            "Maquoketa Web Printing",
            "Marvin Windows and Doors",
            "Masonite Corporation",
            "Master Packaging Inc.",
            "Master Print",
            "MCADAMS GRAPHICS",
            "McArdle Printing Company Inc., The",
            "McGrann Paper Corporation",
            "MCLEAN PACKAGING CORP",
            "McShan Lumber Company, Inc.",
            "McShan Lumber Company, Inc.",
            "Meadowlands Display and Packing, Inc.",
            "Menasha Packaging Company, LLC",
            "Mensch Mill & Lumber Corp",
            "Meredith Webb Printing",
            "Meyers Printing Company",
            "Miami-Dade County, GSA Materials Management",
            "Mid-Atlantic Packaging Inc.",
            "MID-ATLANTIC PRINTERS, LIMITED",
            "Midland Packaging and Display",
            "Midland Paper Company",
            "Midstate Printing Corp.",
            "Millet The Printer, Inc.",
            "Minnesota Corrugated Box, Inc.",
            "MITTERA GROUP",
            "MJB Wood Group, Inc.",
            "MKD International, Inc.",
            "MOD-PAC CORP",
            "Modern Litho Print Co.",
            "Modern Postcard",
            "Mondi Pine Bluff, LLC",
            "Monson Paper, LLC",
            "Moran Printing, Inc.",
            "Mossberg & Co.",
            "Motivating Graphics Inc.",
            "Mulligan Printing",
            "Multi Packaging Solutions",
            "Multi Packaging Solutions Inc.",
            "Murphy Company",
            "MWV International SÃ rl",
            "Mystic Ltd. DBA Sheets Unlimited, LLC",
            "Nahan Printing",
            "Napco, Inc.",
            "National Graphic Solutions",
            "NATIONWIDE ENVELOPE",
            "Neiman Enterprises, Inc.",
            "Nekoosa Coated Products",
            "New Leaf Paper",
            "NEW-INDY OXNARD LLC",
            "NewCorr Packaging",
            "NewPort Timber LLC",
            "Nicholas Earth Printing, LLC",
            "Norcom, Inc.",
            "Norkol, Inc.",
            "North American Communications",
            "North Cascades Forest Products LLC",
            "Novolex",
            "NPC Inc.",
            "NRI",
            "Omaha Box Company",
            "ONETOUCHPOINT MIDWEST CORP dba ONETOUCHPOINT-CCI",
            "Ontex BVBA",
            "Oregon-Canadian Forest Products",
            "Original Impressions",
            "Orion Timberlands, LLC",
            "Orora North America / Corru - Kraft Company",
            "Orora North America / Manufactured Packaging Produ",
            "P.A. Hutchison Company",
            "Pac Paper Inc.",
            "Pacific Paper Trading Co.",
            "Pacific Southwest Container, LLC",
            "Pacific West Litho",
            "Pacific Western Container",
            "Pacific Woodtech Corporation",
            "Packaging Corporation of America",
            "Packaging Graphics, LLC",
            "Packaging Logic, Inc.",
            "PACKAGING SERVICES OF MARYLAND, INC./PSI PACKAGING",
            "Pacon Corporation",
            "Pactiv, LLC",
            "Paige Packaging, Inc.",
            "PAK 2000, Inc.",
            "Palmer Printing, Inc.",
            "Panaprint Inc.",
            "Panoramic Press, Inc.",
            "Panwood Global Ltd.",
            "Paper Pak Industries",
            "Paper Products Marketing (USA) Inc.",
            "Papercone Corporation",
            "PaperWorks Packaging Group",
            "Paradigm Printing Inc.",
            "Park Communications LLC",
            "Parton Lumber Company",
            "PearceWellwood Inc.",
            "Peel District School Board Printing Services Depar",
            "Perez Trading Company inc.",
            "Performance Office Papers",
            "PhilCorr, LLC",
            "Philipp Lithographing",
            "Phoenix Color Corp.",
            "PHOENIX-VETERANS PRINT",
            "Pictorial Corporation",
            "Pioneer Packaging, Inc.",
            "PM Company LLC",
            "Pollard Lumber Company",
            "Ponderay Newsprint",
            "Port Townsend Paper Corporation",
            "POSTYCARDS",
            "Precision Dialogue Direct",
            "Precision Press",
            "President Container Group LLC",
            "Prestone Printing Co.",
            "Preverco Inc. / BFS 2002 Inc.",
            "Princeton Forest Products, Inc.",
            "Principal Life Insurance Company",
            "Prinit Corporation",
            "Printing Concepts, Inc.",
            "Printing Partners, Inc.",
            "Printing Resource, Inc.",
            "PrintingForLess.com",
            "Printxcel",
            "Priority Envelope",
            "PROACTIVE PACKAGING & DISPLAY",
            "PROCURE LLC",
            "Produits Forestiers Lamco Inc.",
            "Produlith Inc.",
            "Prographics Communications LLC",
            "Progress Container & Display",
            "Progress Luv2Pak International Ltd.",
            "Progressive",
            "Progressive Converting Inc. (Pro-Con)",
            "Prolam - SociÃ©tÃ© en commandite Prolam",
            "Prolamina Corporation",
            "PSI CONTAINER, INC",
            "Publication Printers Corp.",
            "PUBLISHERS PRINTING COMPANY LLC",
            "Publix Super Markets Inc., Printing Services",
            "Pyramid Mountain Lumber, Inc.",
            "Quad Graphics, Inc.",
            "Quartier Printing Company, Inc.",
            "R.E.A. Display, Inc.",
            "Ram Forest Group Inc.",
            "RAND GRAPHICS, INC",
            "Rayonier Advanced Materials Wood Procurement LLC",
            "RB Converting",
            "ReEnergy Holdings LLC",
            "Reindl Printing, Inc.",
            "Reliable Container Corporation",
            "Response Envelope Inc.",
            "Rex Corporation",
            "Rex Lumber Company, LLC",
            "Rex Three",
            "REYNOLDS PAPER COMPANY LIMITED",
            "Riverside Printing Inc.",
            "RJ Acquisitions DBA The Ad Art Company",
            "Roaring Spring Paper Products",
            "Rock-Tenn Company",
            "ROEBUCK PRINTING INC",
            "Rohrer Corporation",
            "ROMANOW CONTAINER",
            "Ronpak, Inc.",
            "ROONEY PRINTING CO INC",
            "Rose City Printing and Packaging",
            "RR Donnelley",
            "S & W Forest Products Ltd.",
            "Sacramento Container Corporation",
            "Saint Louis Print Group",
            "San Diego Printers",
            "Sandy Alexander, Inc.",
            "SAPPI North America (S.D. Warren Company)",
            "SAS Institute, Inc.",
            "Schneider Graphics Inc.",
            "Schwarz Partners Packaging Miami LLC",
            "Schwarz Partners Packaging, LLC DBA MaxPak",
            "Scotch & Gulf Lumber, LLC",
            "Scotch Plywood Company, Inc.",
            "Scout Sourcing Inc.",
            "Sealed Air Corporation",
            "Seaman Paper Company of MA., Inc.",
            "SEDA Iberica - Embalagens, S.A.",
            "Seda North America",
            "Senior Paper Corporation",
            "Serenity Packaging Corporation",
            "SF & C Divisions Specialty Industries, Krafcor and",
            "SG360Â°",
            "Shafi's Inc. dba Tiger Press",
            "Shawmut Advertising, Inc., DBA Shawmut Printing",
            "Sheets, LLC",
            "Shutterfly",
            "Sigler Companies",
            "SMC Packaging Group",
            "Smead",
            "Smurfit Kappa Orange County, LLC",
            "Solo Printing, Inc.",
            "Solvay Biomass Energy, LLC",
            "Solvay Biomass Energy, LLC",
            "Sonderen Packaging, Inc.",
            "South Coast Paper",
            "Southern Champion Tray LP",
            "Southern Index, Inc.",
            "Southern Veneer Products",
            "Southland Envelope Co. Inc.",
            "Spearfish Pellet Company, LLC",
            "Specialty Print Communications",
            "Specialty Wood Products Inc.",
            "Spectrum Packaging Network",
            "Spire",
            "St. Joseph Communications",
            "Standard Press Inc.",
            "Standard Register Company",
            "StanPac, Inc.",
            "Staples Print Solutions - Headquarters",
            "States Industries",
            "Steen Macek Paper Co.",
            "Stimson Lumber Company",
            "Strategic Content Imaging - SCI",
            "Strine Printing Company, Inc.",
            "Structural Roof Systems, Inc.",
            "Stylecraft Printing Company",
            "Summit Container Corporation",
            "Sun Litho",
            "SUN PAPER COMPANY",
            "Suncraft Technologies",
            "Super Enterprises - USA, Inc.",
            "Superior Lithographics",
            "Supremex Inc.",
            "Sutherland Packaging, Inc.",
            "Swanson Group Mfg. LLC",
            "Symcor Inc.",
            "Tamarack Mill, LLC dba Evergreen Forest",
            "Tavo Packaging, Inc.",
            "Tension Envelope Corporation",
            "Terrace Paper Company Inc.",
            "Textile Printing Company",
            "TFP Data Systems",
            "The Aaron Group of Companies",
            "The Envelope Express, Inc",
            "The Flesh Company",
            "The Graphic Arts Studio",
            "The Mid-York Press, Inc.",
            "The Millcraft Paper Company",
            "The Newark Group, Inc. - Paper Mill Division",
            "The Odee Company",
            "The Paige Company Containers, Inc.",
            "The Port Townsend Group, Port Townsend Paper Corpo",
            "The Printing House Ltd.",
            "THE ROBINETTE COMPANY",
            "The Sauers Group, Inc.",
            "The Sheridan Press, Inc.",
            "THE STANDARD GROUP",
            "The Triangle Printing and Packaging Company, Inc",
            "The YGS Group",
            "Thelamco Inc.",
            "Thoro Packaging dba FoldedColor",
            "Three Z Printing Co.",
            "TimBar Packaging & Display",
            "Timber Products Company",
            "Timber Products Company",
            "Times Printing Co., Inc.",
            "Torlys Inc.",
            "Tower Litho Company Ltd",
            "Trade Secret Web Printing Inc.",
            "Transcontinental Inc.",
            "TREE HOUSE PAD & PAPER",
            "Trend Offset Printing Services",
            "Tri-State Envelope Corporation",
            "Trojan Lithograph Corporation",
            "Tucker-Castleberry Printing Inc.",
            "Tukaiz, LLC",
            "Tumac Lumber Co. Inc.",
            "Tweddle Group",
            "Twin Rivers Paper Company",
            "Twin Rivers Paper Company, Woodlands & Procurement",
            "Two C Pack Systems, Corp.",
            "U.S. Corrugated of Milwaukee, Inc.",
            "U.S. Corrugated, Inc.",
            "UBS Printing Group, Inc.",
            "Unadilla Laminated Products, Inc.",
            "Unicorr Packaging Group",
            "Unifoil Corporation",
            "Unimac Graphics",
            "United Book Press, Inc.",
            "United Corrstack LLC",
            "United Envelope LLC",
            "United Graphics, LLC",
            "Universal Lithographers",
            "Universal Wilde",
            "University Lithoprinters",
            "US NONWOVENS CORP.",
            "Useful Products, LLC",
            "Utah Paperbox Company DBA UPB",
            "V.G. Reed & Sons Inc.",
            "Valassis Communications, Inc.",
            "VALDESE PACKAGING & LABEL",
            "Valpak Direct Marketing Systems, Inc.",
            "Vanguard Companies",
            "Varn Wood Products, LLC",
            "Veritiv, Unisource Worldwide and xpedx LLC",
            "Verso Corporation",
            "Victor Envelope Co",
            "Vitex Packaging Group",
            "Walsworth Publishing Company",
            "Warneke Paper Box Co",
            "Washburn Graphics, Inc. dba Cadmus dba Cadmus, A C",
            "Watkins Sawmills Ltd.",
            "WD CHIPS LLC",
            "WD CHIPS LLC",
            "Weaber, Inc.",
            "Webb Communications dba Bayard Printing Group",
            "Webcor Packaging Corporation",
            "WEBCRAFTERS, INC.",
            "Weber Display & Packaging",
            "Welch Packaging Group",
            "Weldon, Williams & Lick, Inc.",
            "Wellborn Cabinet",
            "Wertheimer Box Corporation",
            "West Fraser, Inc.",
            "West Linn Paper Company",
            "West Wind Litho",
            "Western States Envelope & Label",
            "Weston Premium Woods",
            "Weston Wood Solutions",
            "Wilen Direct",
            "Winston Packaging, A Winston Printing Company",
            "Winter, Bell Co.",
            "Wisco",
            "Wisconsin Packaging Corp",
            "Woodbury Supply Company, Inc.",
            "Woodland Paper, Inc.",
            "Woodland Pulp LLC",
            "Worzalla Publishing Company",
            "Wright Business Graphics",
            "Wright's Printing & Marketing LLP",
            "xpedx LLC (Veritiv and Unisource Worldwide)",
            "Yoknapatawpha, LLC dba Titan Converting",
            "York Container",
            "YURCHAK PRINTING",
            "Zenger Group",
            "Zilkha Biomass Fuels I LLC",
            "Zilkha Biomass Fuels I LLC",
            "ZUZA Marketing Asset Management"
        ];

        $scope.producers = _.unique($scope.producers);

        $scope.addProducer = function(){

            if($scope.cs8Form.producerSource.$valid && $scope.cs8Form.percPurchased.$valid){

                //alert($scope.producer.source);
                if(!$scope.producerIndex){

                    $scope.cs8.primaryProducers.push($scope.producer);
                }

                $scope.producerIndex = null;
                $scope.producer = {};
            }
        }

        $scope.editProducer = function(index, producer){
            $scope.producerIndex = index;
            $scope.producer = producer;
        }

        $scope.deleteProducer = function(index){
            //
            //if(confirm('Are you sure to delete this item ?')){
            //    $scope.cs8.primaryProducers.splice(index, 1);
            //}
            $('#delete2').modal();
        }

        $scope.deleteConfirm2 = function(index){

            $scope.cs8.primaryProducers.splice(index, 1);

         }

        $scope.contact = {};
        $scope.contactIndex = null;

        $scope.isContactDirty = function(){
            return $scope.contact.name ||
                $scope.contact.email ||
                $scope.contact.position;
        }


        $scope.addContact = function(){

            if(!$scope.contactForm.$valid){
                return false;
            }

            if($scope.contactIndex == null){
                $scope.contactIndex = $scope.cs8.orgContacts.length;
                $scope.cs8.orgContacts.push({});
            }

            $scope.cs8.orgContacts[$scope.contactIndex] = {
                name     : $scope.contact.name,
                email    : $scope.contact.email,
                position : $scope.contact.position
            }

            $scope.contact = {};
            $scope.contactIndex = null;


        }

        $scope.editContact = function(index, contact){
            $scope.contactIndex = index;
            $scope.contact = angular.copy(contact);
        }

        $scope.deleteContact = function(index, contact){
            //if(confirm("Are you sure to delete this ?")){
            //    $scope.cs8.orgContacts.splice(index, 1);
            //}
            $('#delete1').modal();

        }
            $scope.deleteConfirm = function(index){

                $scope.cs8.orgContacts.splice(index, 1);

            }

        $scope.user = [];
        $scope.countries = Countries.getAll();


        $scope.anySelect = function(){

            var flag = false;

            var hasSelected = _.find($scope.productItems(), function(key){
                return $scope.cs8[key];
            });

            return hasSelected ? true : false;
        }

        $scope.productItems = function(){

            return [
                'productSegmentPrintingWritingPaper',
                'productSegmentPackaging',
                'productSegmentBioenergy',
                'productSegmentPulp',
                'productSegmentLand',
                'productSegmentSolidWood',
                'productSegmentPaperMerchant',
                'productSegmentPaperBoard',
                'productSegmentFurniture',
                'productSegmentTowelTissue',
                'productSegmentPrinter',
                'productSegmentWoodMerchant',
                'productSegmentOther'
            ]

        }


        $scope.printingWritingPaper = function(){
            return $scope.cs8.productSegmentPrintingWritingPaper;
        }

        $scope.packaging = function(){
                return $scope.cs8.productSegmentPackaging;
        }

        $scope.bioenergy = function(){
            return $scope.cs8.productSegmentBioenergy;
        }

        $scope.pulp = function(){
            return $scope.cs8.productSegmentPulp;
        }

        $scope.land = function(){
            return $scope.cs8.productSegmentLand;
        }

        $scope.solidWood = function(){
            return $scope.cs8.productSegmentSolidWood;
        }

        $scope.paperMerchant = function(){
            return $scope.cs8.productSegmentPaperMerchant;
        }

        $scope.paperBoard = function(){
            return $scope.cs8.productSegmentPaperBoard;
        }

        $scope.furniture = function(){
            return $scope.cs8.productSegmentFurniture;
        }

        $scope.towelTissue = function(){
            return $scope.cs8.productSegmentTowelTissue;
        }

        $scope.printer = function(){
            return $scope.cs8.productSegmentPrinter;
        }

        $scope.woodMerchant = function(){
            return $scope.cs8.productSegmentWoodMerchant;
        }

        $scope.other = function(){
            return $scope.cs8.productSegmentOther;
        }



        $scope.isSelected = function(model, val){

            return _.indexOf(model, val) > -1;
        }

        $scope.setForms = function(){
            $rootScope.$form = $scope.cs8Form;
        }


        $scope.saveForm = function(go){

            if($scope.cs8Form.$valid){

                $http
                    .put("/form/cs8", $scope.formData())
                    .then(function(response){

                        if(response.data){

                            $scope.cs8Form.$setPristine();
                            $rootScope.form.cs8 = response.data;
                            Message.success('Section successfully saved', '.msg-cont');
                            $rootScope.updateFormMeta();
                        }


                        if(go){
                            $rootScope.goStep("cs9")
                        }

                    });
            }

        }

}]);
