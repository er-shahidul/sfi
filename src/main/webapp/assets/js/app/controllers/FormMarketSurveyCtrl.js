
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

        $scope.producers = {
             1	 : "Bind-Rite Services, Inc.",
             2	 : "Bio-Pappel International, Inc.",
             3	 : "Blue Ridge Printing",
             4	 : "BOCA Systems",
             5	 : "Boehmer Box LP dba Canampac dba LYFT Visual",
             6	 : "Bois Expansion Inc.",
             7	 : "Boscus Canada Inc.",
             8	 : "Boss Litho, Inc.",
             9	 : "Boutwell, Owens & Co. Inc.",
             10	 : "BOXES R US, INC. dba ULTIMATE PAPERBOX CO",
             11	 : "BPG Graphic Solutions dab Mi5 Print and Digital Co",
             12	 : "BPM, Inc.",
             13	 : "Bradford & Bigelow",
             14	 : "Bridge View Paper Company",
             15	 : "Briggs & Stratton",
             16	 : "BSC Acquisition Sub, LLC, dba Double Envelope, Con",
             17	 : "BUILDING PRODUCTS PLUS LLC",
             18	 : "Burd and Fletcher",
             19	 : "Burrows Paper Corporation",
             20	 : "Burton & Mayer Inc.",
             21	 : "BUYSEASONS, Inc.",
             22	 : "C & S Press Inc.",
             23	 : "C&B Display Packaging Inc.",
             24	 : "C.J. Duffey Paper Company",
             25	 : "C.W. Zumbiel Company, The",
             26	 : "Cadmus Communications A Cenveo Company",
             27	 : "Cadmus Journal Services dba Cenveo Publisher Servi",
             28	 : "Canadian Wood Products - Montréal Inc.",
             29	 : "Capital Corrugated & Carton dba Sierra Sheets",
             30	 : "Capital Printing",
             31	 : "Caraustar Industries Inc.",
             32	 : "CARAUSTAR TAMA PAPERBOARD",
             33	 : "Cardinal Color Print",
             34	 : "CardPak, Inc.",
             35	 : "Carolina Container Company",
             36	 : "CartonCraft, Inc.",
             37	 : "Case Paper Company Inc",
             38	 : "CDS Global",
             39	 : "Cedar Creek",
             40	 : "Center for Forest and Wood Certification",
             41	 : "Central Florida Press",
             42	 : "Central Group, The",
             43	 : "Central Michigan Hardwoods",
             44	 : "Central Michigan Paper Company",
             45	 : "Central National-Gottesman, Inc.",
             46	 : "Cenveo Cadmus - Port City Press",
             47	 : "Cenveo Commercial Envelope Manufacturing",
             48	 : "Cenveo Corporation",
             49	 : "Cenveo McLaren Morris & Todd Company",
             50	 : "Cenveo-Toledo",
             51	 : "Champion Container Corporation",
             52	 : "Chartpak, Inc.",
             53	 : "Chicago Press Corporation",
             54	 : "Chroma Graphics, Inc.",
             55	 : "Circle Incorporated",
             56	 : "CJK Print Possibilities",
             57	 : "Clampitt Paper Company",
             58	 : "Clark's Hardwood Lumber Co., L.P.",
             59	 : "Classic Color, Inc.",
             60	 : "Classic Envelope Inc",
             61	 : "Clifford Paper Inc. dba Media Solutions also tradi",
             62	 : "Clondalkin Pharma & Healthcare",
             63	 : "Coating Excellence International, LLC",
             64	 : "Colad Group LLC, The",
             65	 : "Colbert Packaging Corporation",
             66	 : "Collinsville Printing",
             67	 : "Colonial Press international, Inc.",
             68	 : "ColorGraphics",
             69	 : "Colortree Group, Inc.",
             70	 : "Columbus Productions",
             71	 : "Comet School Supplies",
             72	 : "Command Web Missouri",
             73	 : "Commencement Bay Corrugated",
             74	 : "COMMERCIAL LUMBER AND PALLET COMPANY INC",
             75	 : "Compass Packaging LLC",
             76	 : "Connemara Converting",
             77	 : "Container Service Corp",
             78	 : "Continental Accessory Corp.",
             79	 : "Conversion Millennium (2003) Inc.",
             80	 : "Copap Inc. DBA Copap Trading Inc.",
             81	 : "Copy General Corporation",
             82	 : "Core Communications",
             83	 : "Corpap Inc",
             84	 : "CorrChoice",
             85	 : "Corrugated Supplies, LLC",
             86	 : "Coveris Flexibles US, LLC",
             87	 : "Craftmaster Printers, Inc.",
             88	 : "Creative Press Inc.",
             89	 : "Creel Printing and Publishing, Inc.",
             90	 : "CRT, Custom Products, Inc.",
             91	 : "Crusader Paper Company",
             92	 : "CTP Cartons and Labels – A division of CTP Limited",
             93	 : "Cultech, Inc. A Subsidiary of Autajon Group",
             94	 : "Curtis Packaging",
             95	 : "Cutting Edge Paper Limited",
             96	 : "CV Studio",
             97	 : "DanHil Containers II, LTD.",
             98	 : "Daniels Business Services, Inc. dba Daniels Graphi",
             99	 : "Daniels Woodcarving Co., Inc",
             100 : "DART CONTAINER CORPORATION",
             101 : "Dartmouth Printing Company",
             102 : "Data Reproductions",
             103 : "Datatel Resources Corporation",
             104 : "Dee Paper Box Company",
             105 : "Deline Box Company",
             106 : "Delta Corrugated Paper Products",
             107 : "Democrat Printing & Lithographing Co.",
             108 : "DG3 North America, Inc.",
             109 : "DIAMOND ENVELOPE CORPORATION",
             110 : "Direction Furniture Company Inc.",
             111 : "DISC Graphics, Inc.",
             112 : "Display Pack Inc.",
             113 : "District Creative Printing Inc.",
             114 : "Dixie Pulp and Paper, Inc.",
             115 : "Dixon Direct",
             116 : "Dobi & Associates, Inc.",
             117 : "Documation LLC",
             118 : "Dolce Brothers Printing, Inc.",
             119 : "Dominion Holdings, Inc. DBA Source 4",
             120 : "Double H Plastics, Inc.",
             121 : "Drax Biomass Inc.",
             122 : "DreamWorks Graphic Communications, LLC",
             123 : "Drummond Press, The",
             124 : "DS Graphics Inc.",
             125 : "DST Output LLC",
             126 : "Dual Graphics, Inc.",
             127 : "Dura-Fibre, LLC",
             128 : "Duro Hilex Poly, LLC, a subsidiary of Novolex Hold",
             129 : "Eagle Veneer, Inc.",
             130 : "EarthColor, Inc.",
             131 : "Edison Lithograph & Printing",
             132 : "Edwards Brothers Malloy",
             133 : "Ekman and Co Inc",
             134 : "El Dorado Packaging, Inc.",
             135 : "ElandersUSA, LLC",
             136 : "Elk Designs Incorporated",
             137 : "Elk Grove Graphics",
             138 : "Ellis Packaging Limited",
             139 : "Ellis Packaging West Inc.",
             140 : "Ellis Paper Box Inc.",
             141 : "Elopak Canada Inc.",
             142 : "Emballages Netpak Inc.",
             143 : "Emballages Stuart Packaging Inc.",
             144 : "EMPIRE CONTAINER CORP",
             145 : "ENAP, Inc.",
             146 : "Endura Products, Inc.",
             147 : "Ennis-Leipsic",
             148 : "Envelope 1, Inc.",
             149 : "Envision Graphics, dba Envision3",
             150 : "Enviva Holdings LP",
             151 : "EU Services",
             152 : "Everest Expedition, LLC, dba The Worden Company an",
             153 : "Everett Graphics",
             154 : "Evergreen Packaging, Inc.",
             155 : "Expera Specialty Solutions, LLC",
             156 : "FCL Graphics",
             157 : "Fellowes, Inc.",
             158 : "Ferguson Box",
             159 : "Fibercorr Mills, LLC",
             160 : "FiberMark North America, Inc.",
             161 : "Fibre Source International Corp./Fibre Source Nort",
             162 : "Fibreco Export Inc.",
             163 : "FIBRO SOURCE USA, INC.",
             164 : "Field Paper Company",
             165 : "Fifth Third Bank",
             166 : "Financial Graphic Service, Inc.",
             167 : "Finch Paper LLC",
             168 : "First Edge Solutions",
             169 : "Five Star Sheets LLC",
             170 : "Fleetwood Fibre Packaging & Graphics",
             171 : "Flower City Printing",
             172 : "FoldedPak, Inc.",
             173 : "Foremost Graphics LLC",
             174 : "Forest City Trading Group, LLC",
             175 : "FORMULARIOS DE MEXICO, S.A. DE C.V.",
             176 : "Forney Coated Products a division of Smurfit Kappa",
             177 : "Forum Communications Printing",
             178 : "Franklin Press Inc.",
             179 : "Freedom Graphics Systems",
             180 : "French Paper",
             181 : "Garvey Group, The",
             182 : "Gateway Packaging Company",
             183 : "Gateway Press, Inc.",
             184 : "GEORGE CORIATY DBA SIR SPEEDY PRINTING",
             185 : "George H. Dean Company",
             186 : "Georgia Biomass LLC",
             187 : "Georgia-Pacific Corrugated LLC",
             188 : "Globus Printing and Packaging",
             189 : "Glover Corporation",
             190 : "GLS Companies",
             191 : "GM Wood Products",
             192 : "Goetz Printing Company, The",
             193 : "Gould Paper Corp.",
             194 : "GP Cellulose GmbH",
             195 : "Grand Traverse Container, Inc.",
             196 : "Graphic Communications",
             197 : "Graphic Communications Corporation",
             198 : "Graphic Visual Solutions",
             199 : "GRAPH-PAK CORPORATION",
             200 : "Great Atlantic Graphics, Inc.",
             201 : "Great Lakes Packaging Corporation",
             202 : "Great Little Box Company",
             203 : "Great Northern Corporation",
             204 : "Greatview Aseptic Packaging (Shandong)Co., Ltd./Gr",
             205 : "Greatview Beijing Trading Co., Ltd",
             206 : "Greatview Holdings Limited",
             207 : "Green Bay Packaging Inc.",
             208 : "GREENER PLANET, LLC",
             209 : "Greif Packaging, LLC",
             210 : "Grupo IFM",
             211 : "Grupo Infagon",
             212 : "GRUPO PAPELERO SCRIBE S.A. DE C.V.",
             213 : "Hallmark Cards Inc",
             214 : "Hampden Papers",
             215 : "Hampton Resources, Inc.",
             216 : "Harmony Press Inc. D/B/A Harmony Marketing Group",
             217 : "Harris Packaging Corporation",
             218 : "Hartford City Paper LLC",
             219 : "Hasbro, Inc.",
             220 : "HAWKEYE CORRUGATED BOX",
             221 : "Hazen Paper Company",
             222 : "Heinrich Envelope Corporation",
             223 : "Herzog Veneers",
             224 : "Hexacomb Corporation, a PCA Brand",
             225 : "Highland Craftsman",
             226 : "HighRoad Press LLC",
             227 : "HM Graphics",
             228 : "HM Woodworking",
             229 : "Hobby Press, Inc. DBA Executive Printers of Florid",
             230 : "Hoff Enterprises Inc.",
             231 : "Hoffmaster Group, Inc.®",
             232 : "Holmberg Co. Inc.",
             233 : "Hood Container Corporation",
             234 : "Hood Packaging Corporation",
             235 : "Horizon Printing",
             236 : "HOT d/b/a EMI Enterprises d/b/a Envelope Mart",
             237 : "Hub Folding Box Co., Inc.",
             238 : "Huhtamaki, Inc.",
             239 : "Huston Patterson Corporation/ Sigma Graphics",
             240 : "Hutchison-Allgood Printing Co.",
             241 : "Hylton Paper Company, Inc.",
             242 : "iBox Packaging Ltd.",
             243 : "IBS Direct",
             244 : "Idaho Forest Group, LLC",
             245 : "Ideal",
             246 : "Imagesmith",
             247 : "IMEX Credit LLC, dba IMEX PAPER",
             248 : "Imperial Lithographing",
             249 : "Impressions Incorporated",
             250 : "Imprimerie Lebonfon Inc.",
             251 : "Imprimerie PUB CITE",
             252 : "Imprimerie Solisco Inc.",
             253 : "Independence Corrugated LLC",
             254 : "Independent II, LLC",
             255 : "Independent Paperboard Marketing",
             256 : "Infinity Global",
             257 : "Innovative Designs, LLC",
             258 : "Integrated Print & Graphics Inc.",
             259 : "Integrity Graphics",
             260 : "Intercarton, S. de R.L. de C.V.",
             261 : "International ESP, Inc.",
             262 : "International Institute for Learning, Inc.",
             263 : "International Paper Foodservice Business",
             264 : "International Paperbox",
             265 : "Interprint Web Printing",
             266 : "Interstate Container Reading LLC",
             267 : "Interstate Paper LLC",
             268 : "Irving Tissue Company",
             269 : "Island Container Corp",
             270 : "ITW Laminations",
             271 : "Ivex Specialty Paper, LLC",
             272 : "J&A Printing",
             273 : "J.D. Irving Limited",
             274 : "Jackson Paper Manufacturing Company",
             275 : "Japs-Olson Company",
             276 : "Jay Packaging Group, Inc.",
             277 : "JBM Envelope Company",
             278 : "JELD-WEN Windows and Doors",
             279 : "Jimmy Whittington Lumber",
             280 : "JJ Collins Printers, Inc.",
             281 : "Joe Piper Inc.",
             282 : "John Roberts Company, The",
             283 : "Johns Manville",
             284 : "JohnsByrne",
             285 : "Johnson Brothers Lumber",
             286 : "Johnson/Anderson and Associates",
             287 : "Jones Packaging Inc.",
             288 : "Jordan Lumber & Supply, Inc.",
             289 : "Jostens Inc.",
             290 : "Justman Packaging and Display",
             291 : "K & D Graphics, Printing and Packaging",
             292 : "K 1 Packaging Group",
             293 : "Kanzaki Specialty Papers, Inc.",
             294 : "Kaweah Container",
             295 : "KDM Enterprises LLC",
             296 : "Kempf Paper Corporation",
             297 : "Kennickell Print",
             298 : "KEY CONTAINER CORPORATION",
             299 : "King Printing Company, Inc.",
             300 : "Kingery Printing",
             301 : "Kirkwood Printing Company",
             302 : "KORAB USA, LLC",
             303 : "Kruger Inc. - Emballages KRUPACK",
             304 : "KyKenKee, Inc.",
             305 : "Lacorr Packaging",
             306 : "Lake Book Manufacturing",
             307 : "Lakeland Paper Corporation",
             308 : "Lane Press, The",
             309 : "Langston Companies Inc.",
             310 : "Larson Juhl US LLC",
             311 : "Las Vegas Color Graphics",
             312 : "Lauterbach Group",
             313 : "Lee Industries, Inc.",
             314 : "Lefavor Envelope Company",
             315 : "LeNoble Lumber Co., Inc.",
             316 : "LES BOIS DU FJORD INC.",
             317 : "Les Papiers Atlas Inc.",
             318 : "Lewis Paper",
             319 : "Liberty Carton Company-Metro",
             320 : "Liberty Paper",
             321 : "Lifetouch Services, Inc.",
             322 : "Lightning Source Inc.",
             323 : "Lincoln Paper and Tissue",
             324 : "Lindsay Paper Box Co., LTD, The",
             325 : "Little Rapids Corporation",
             326 : "Love Envelopes, Inc.",
             327 : "Loyola Paper",
             328 : "M.P.I. Moulin a papier de Portneuf",
             329 : "Mac Papers, Inc.",
             330 : "MACKAYMITCHELL ENVELOPE COMPANY",
             331 : "Madison Paper Industries, a UPM Group Company",
             332 : "Malnove Holding Company Corp. Purchasing",
             333 : "Manchester Industries",
             334 : "Mansir Printing LLC",
             335 : "Maquoketa Web Printing",
             336 : "Marvin Windows and Doors",
             337 : "Master Packaging Inc.",
             338 : "Master Print",
             339 : "MCADAMS GRAPHICS",
             340 : "McArdle Printing Company Inc., The",
             341 : "McGrann Paper Corporation",
             342 : "MCLEAN PACKAGING CORP",
             343 : "McShan Lumber Company, Inc.",
             344 : "Meadowlands Display and Packing, Inc.",
             345 : "Menasha Packaging Company, LLC",
             346 : "Mensch Mill & Lumber Corp",
             347 : "Meredith Webb Printing",
             348 : "Meyers Printing Company",
             349 : "Miami-Dade County, GSA Materials Management",
             350 : "Mid-Atlantic Packaging Inc.",
             351 : "MID-ATLANTIC PRINTERS, LIMITED",
             352 : "Midland Packaging and Display",
             353 : "Midland Paper Company",
             354 : "Midstate Printing Corp.",
             355 : "Millet The Printer, Inc.",
             356 : "Minnesota Corrugated Box, Inc.",
             357 : "MITTERA GROUP",
             358 : "MJB Wood Group, Inc.",
             359 : "MKD International, Inc.",
             360 : "Modern Litho Print Co.",
             361 : "Modern Postcard",
             362 : "MOD-PAC CORP",
             363 : "Monson Paper, LLC",
             364 : "Moran Printing, Inc.",
             365 : "Mossberg & Co.",
             366 : "Motivating Graphics Inc.",
             367 : "Mulligan Printing",
             368 : "Multi Packaging Solutions",
             369 : "Multi Packaging Solutions Inc.",
             370 : "Murphy Company",
             371 : "MWV International Sàrl",
             372 : "Mystic Ltd. DBA Sheets Unlimited, LLC",
             373 : "Nahan Printing",
             374 : "Napco, Inc.",
             375 : "National Graphic Solutions",
             376 : "NATIONWIDE ENVELOPE",
             377 : "Nekoosa Coated Products",
             378 : "New Leaf Paper",
             379 : "NewCorr Packaging",
             380 : "NEW-INDY OXNARD LLC",
             381 : "Nicholas Earth Printing, LLC",
             382 : "Norcom, Inc.",
             383 : "Norkol, Inc.",
             384 : "North American Communications",
             385 : "North Cascades Forest Products LLC",
             386 : "Novolex",
             387 : "NPC Inc.",
             388 : "NRI",
             389 : "Omaha Box Company",
             390 : "ONETOUCHPOINT MIDWEST CORP dba ONETOUCHPOINT-CCI",
             391 : "Ontex BVBA",
             392 : "Oregon-Canadian Forest Products",
             393 : "Original Impressions",
             394 : "Orora North America / Corru - Kraft Company",
             395 : "Orora North America / Manufactured Packaging Produ",
             396 : "P.A. Hutchison Company",
             397 : "Pac Paper Inc.",
             398 : "Pacific Paper Trading Co.",
             399 : "Pacific Southwest Container, LLC",
             400 : "Pacific West Litho",
             401 : "Pacific Western Container",
             402 : "Pacific Woodtech Corporation",
             403 : "Packaging Graphics, LLC",
             404 : "Packaging Logic, Inc.",
             405 : "PACKAGING SERVICES OF MARYLAND, INC./PSI PACKAGING",
             406 : "Pacon Corporation",
             407 : "Pactiv, LLC",
             408 : "Paige Packaging, Inc.",
             409 : "PAK 2000, Inc.",
             410 : "Palmer Printing, Inc.",
             411 : "Panaprint Inc.",
             412 : "Panoramic Press, Inc.",
             413 : "Panwood Global Ltd.",
             414 : "Paper Pak Industries",
             415 : "Paper Products Marketing (USA) Inc.",
             416 : "Papercone Corporation",
             417 : "PaperWorks Packaging Group",
             418 : "Paradigm Printing Inc.",
             419 : "Park Communications LLC",
             420 : "PearceWellwood Inc.",
             421 : "Peel District School Board Printing Services Depar",
             422 : "Perez Trading Company inc.",
             423 : "Performance Office Papers",
             424 : "PhilCorr, LLC",
             425 : "Philipp Lithographing",
             426 : "Phoenix Color Corp.",
             427 : "PHOENIX-VETERANS PRINT",
             428 : "Pictorial Corporation",
             429 : "Pioneer Packaging, Inc.",
             430 : "PM Company LLC",
             431 : "POSTYCARDS",
             432 : "Precision Dialogue Direct",
             433 : "Precision Press",
             434 : "President Container Group LLC",
             435 : "Prestone Printing Co.",
             436 : "Preverco Inc. / BFS 2002 Inc.",
             437 : "Princeton Forest Products, Inc.",
             438 : "Principal Life Insurance Company",
             439 : "Prinit Corporation",
             440 : "Printing Concepts, Inc.",
             441 : "Printing Partners, Inc.",
             442 : "Printing Resource, Inc.",
             443 : "PrintingForLess.com",
             444 : "Printxcel",
             445 : "Priority Envelope",
             446 : "PROACTIVE PACKAGING & DISPLAY",
             447 : "Produits Forestiers Lamco Inc.",
             448 : "Produlith Inc.",
             449 : "Prographics Communications LLC",
             450 : "Progress Container & Display",
             451 : "Progress Luv2Pak International Ltd.",
             452 : "Progressive",
             453 : "Progressive Converting Inc. (Pro-Con)",
             454 : "Prolam - Société en commandite Prolam",
             455 : "Prolamina Corporation",
             456 : "PSI CONTAINER, INC",
             457 : "Publication Printers Corp.",
             458 : "PUBLISHERS PRINTING COMPANY LLC",
             459 : "Publix Super Markets Inc., Printing Services",
             460 : "Quad Graphics, Inc.",
             461 : "Quartier Printing Company, Inc.",
             462 : "R.E.A. Display, Inc.",
             463 : "Ram Forest Group Inc.",
             464 : "RAND GRAPHICS, INC",
             465 : "RB Converting",
             466 : "Reindl Printing, Inc.",
             467 : "Reliable Container Corporation",
             468 : "Response Envelope Inc.",
             469 : "Rex Corporation",
             470 : "Rex Three",
             471 : "REYNOLDS PAPER COMPANY LIMITED",
             472 : "Riverside Printing Inc.",
             473 : "RJ Acquisitions DBA The Ad Art Company",
             474 : "Roaring Spring Paper Products",
             475 : "ROEBUCK PRINTING INC",
             476 : "Rohrer Corporation",
             477 : "ROMANOW CONTAINER",
             478 : "Ronpak, Inc.",
             479 : "ROONEY PRINTING CO INC",
             480 : "Rose City Printing and Packaging",
             481 : "RR Donnelley",
             482 : "S & W Forest Products Ltd.",
             483 : "Sacramento Container Corporation",
             484 : "Saint Louis Print Group",
             485 : "San Diego Printers",
             486 : "Sandy Alexander, Inc.",
             487 : "SAS Institute, Inc.",
             488 : "Schneider Graphics Inc.",
             489 : "Schwarz Partners Packaging Miami LLC",
             490 : "Schwarz Partners Packaging, LLC DBA MaxPak",
             491 : "Scout Sourcing Inc.",
             492 : "Sealed Air Corporation",
             493 : "Seaman Paper Company of MA., Inc.",
             494 : "SEDA Iberica - Embalagens, S.A.",
             495 : "Seda North America",
             496 : "Senior Paper Corporation",
             497 : "Serenity Packaging Corporation",
             498 : "SF & C Divisions Specialty Industries, Krafcor and",
             499 : "SG360°",
             500 : "Shafi's Inc. dba Tiger Press",
             501 : "Shawmut Advertising, Inc., DBA Shawmut Printing",
             502 : "Sheets, LLC",
             503 : "Shutterfly",
             504 : "Sigler Companies",
             505 : "SMC Packaging Group",
             506 : "Smead",
             507 : "Smurfit Kappa Orange County, LLC",
             508 : "Solo Printing, Inc.",
             509 : "Solvay Biomass Energy, LLC",
             510 : "Sonderen Packaging, Inc.",
             511 : "South Coast Paper",
             512 : "Southern Champion Tray LP",
             513 : "Southern Index, Inc.",
             514 : "Southland Envelope Co. Inc.",
             515 : "Spearfish Pellet Company, LLC",
             516 : "Specialty Print Communications",
             517 : "Specialty Wood Products Inc.",
             518 : "Spectrum Packaging Network",
             519 : "Spire",
             520 : "St. Joseph Communications",
             521 : "Standard Press Inc.",
             522 : "Standard Register Company",
             523 : "StanPac, Inc.",
             524 : "Staples Print Solutions - Headquarters",
             525 : "States Industries",
             526 : "Steen Macek Paper Co.",
             527 : "Stimson Lumber Company",
             528 : "Strategic Content Imaging - SCI",
             529 : "Strine Printing Company, Inc.",
             530 : "Structural Roof Systems, Inc.",
             531 : "Stylecraft Printing Company",
             532 : "Summit Container Corporation",
             533 : "Sun Litho",
             534 : "SUN PAPER COMPANY",
             535 : "Suncraft Technologies",
             536 : "Super Enterprises - USA, Inc.",
             537 : "Superior Lithographics",
             538 : "Supremex Inc.",
             539 : "Sutherland Packaging, Inc.",
             540 : "Symcor Inc.",
             541 : "Tavo Packaging, Inc.",
             542 : "Tension Envelope Corporation",
             543 : "Terrace Paper Company Inc.",
             544 : "Textile Printing Company",
             545 : "TFP Data Systems",
             546 : "The Aaron Group of Companies",
             547 : "The Envelope Express, Inc",
             548 : "The Flesh Company",
             549 : "The Graphic Arts Studio",
             550 : "The Mid-York Press, Inc.",
             551 : "The Millcraft Paper Company",
             552 : "The Newark Group, Inc. - Paper Mill Division",
             553 : "The Odee Company",
             554 : "The Paige Company Containers, Inc.",
             555 : "The Printing House Ltd.",
             556 : "THE ROBINETTE COMPANY",
             557 : "The Sauers Group, Inc.",
             558 : "The Sheridan Press, Inc.",
             559 : "THE STANDARD GROUP",
             560 : "The Triangle Printing and Packaging Company, Inc",
             561 : "The YGS Group",
             562 : "Thelamco Inc.",
             563 : "Thoro Packaging dba FoldedColor",
             564 : "Three Z Printing Co.",
             565 : "TimBar Packaging & Display",
             566 : "Timber Products Company",
             567 : "Times Printing Co., Inc.",
             568 : "Torlys Inc.",
             569 : "Tower Litho Company Ltd",
             570 : "Trade Secret Web Printing Inc.",
             571 : "Transcontinental Inc.",
             572 : "TREE HOUSE PAD & PAPER",
             573 : "Trend Offset Printing Services",
             574 : "Tri-State Envelope Corporation",
             575 : "Trojan Lithograph Corporation",
             576 : "Tucker-Castleberry Printing Inc.",
             577 : "Tukaiz, LLC",
             578 : "Tumac Lumber Co. Inc.",
             579 : "Tweddle Group",
             580 : "Twin Rivers Paper Company",
             581 : "Two C Pack Systems, Corp.",
             582 : "U.S. Corrugated of Milwaukee, Inc.",
             583 : "U.S. Corrugated, Inc.",
             584 : "UBS Printing Group, Inc.",
             585 : "Unadilla Laminated Products, Inc.",
             586 : "Unicorr Packaging Group",
             587 : "Unifoil Corporation",
             588 : "Unimac Graphics",
             589 : "United Book Press, Inc.",
             590 : "United Corrstack LLC",
             591 : "United Envelope LLC",
             592 : "United Graphics, LLC",
             593 : "Universal Lithographers",
             594 : "Universal Wilde",
             595 : "University Lithoprinters",
             596 : "US NONWOVENS CORP.",
             597 : "Useful Products, LLC",
             598 : "Utah Paperbox Company DBA UPB",
             599 : "V.G. Reed & Sons Inc.",
             600 : "Valassis Communications, Inc.",
             601 : "VALDESE PACKAGING & LABEL",
             602 : "Valpak Direct Marketing Systems, Inc.",
             603 : "Vanguard Companies",
             604 : "Veritiv, Unisource Worldwide and xpedx LLC",
             605 : "Verso Corporation",
             606 : "Victor Envelope Co",
             607 : "Vitex Packaging Group",
             608 : "Walsworth Publishing Company",
             609 : "Warneke Paper Box Co",
             610 : "Washburn Graphics, Inc. dba Cadmus dba Cadmus, A C",
             611 : "Watkins Sawmills Ltd.",
             612 : "WD CHIPS LLC",
             613 : "Webb Communications dba Bayard Printing Group",
             614 : "Webcor Packaging Corporation",
             615 : "WEBCRAFTERS, INC.",
             616 : "Weber Display & Packaging",
             617 : "Welch Packaging Group",
             618 : "Weldon, Williams & Lick, Inc.",
             619 : "Wellborn Cabinet",
             620 : "Wertheimer Box Corporation",
             621 : "West Linn Paper Company",
             622 : "West Wind Litho",
             623 : "Western States Envelope & Label",
             624 : "Weston Premium Woods",
             625 : "Weston Wood Solutions",
             626 : "Wilen Direct",
             627 : "Winston Packaging, A Winston Printing Company",
             628 : "Winter, Bell Co.",
             629 : "Wisco",
             630 : "Wisconsin Packaging Corp",
             631 : "Woodbury Supply Company, Inc.",
             632 : "Woodland Paper, Inc.",
             633 : "Worzalla Publishing Company",
             634 : "Wright Business Graphics",
             635 : "Wright's Printing & Marketing LLP",
             636 : "xpedx LLC (Veritiv and Unisource Worldwide)",
             637 : "Yoknapatawpha, LLC dba Titan Converting",
             638 : "York Container",
             639 : "YURCHAK PRINTING",
             640 : "Zenger Group",
             641 : "Zilkha Biomass Fuels I LLC",
             642 : "ZUZA Marketing Asset Management",
             643 : "Anthony Forest Products",
             644 : "Bear Island Paper Company WB LLC",
             645 : "Boise Cascade Company",
             646 : "Boise Paper Holdings, LLC",
             647 : "C&D Lumber Co.",
             648 : "Cal-Tex Lumber Company, Inc.",
             649 : "Canfor Southern Pine",
             650 : "Canyon Lumber Co., Inc.",
             651 : "Catalyst Paper Corporation",
             652 : "Clearwater Paper Corporation",
             653 : "Clearwater Paper Corporation - AR",
             654 : "Clearwater Paper Corporation - Lewiston",
             655 : "Cogent Fibre Inc.",
             656 : "Collum's Lumber Products, LLC",
             657 : "Domtar Paper Company LLC",
             658 : "Drax Biomass Inc.",
             659 : "Durgin and Crowell Lumber Co., Inc.",
             660 : "Edwards Wood Products",
             661 : "Enviva Holdings LP",
             662 : "Evergreen Packaging, Inc.",
             663 : "Expera Specialty Solutions, LLC",
             664 : "F.H. Stoltze Land & Lumber Company",
             665 : "Georgia Biomass LLC",
             666 : "Georgia-Pacific LLC",
             667 : "Glatfelter - Wood Division",
             668 : "Glatfelter Chillicothe Woodlands",
             669 : "Graphic Packaging International",
             670 : "Greif Packaging, LLC",
             671 : "H.W. Culp Lumber Company",
             672 : "Hankins, Inc.",
             673 : "Harden Furniture, Inc.",
             674 : "Homan Industries",
             675 : "Hood Container Corporation",
             676 : "Hood Industries, Inc.",
             677 : "Howe Sound Pulp & Paper Corporation",
             678 : "Huber Engineered Woods, LLC",
             679 : "Idaho Forest Group, LLC",
             680 : "Idaho Timber, LLC",
             681 : "Interfor (formerly Tolleson Lumber LLC)",
             682 : "International Paper Company",
             683 : "Jasper Lumber Company/ Southern Wood Chips",
             684 : "Joe N. Miles and Sons, Inc.",
             685 : "Jordan Lumber & Supply, Inc.",
             686 : "KapStone Paper and Packaging Corporation",
             687 : "Katahdin Forest Management LLC",
             688 : "King Forest Industries, Inc.",
             689 : "KPAQ Industries, LLC",
             690 : "KyKenKee, Inc.",
             691 : "Lampe & Malphrus Lumber Company",
             692 : "Lincoln Paper and Tissue",
             693 : "Madison Paper Industries, a UPM Group Company",
             694 : "Masonite Corporation",
             695 : "McShan Lumber Company, Inc.",
             696 : "Mondi Pine Bluff, LLC",
             697 : "Neiman Enterprises, Inc.",
             698 : "NewPort Timber LLC",
             699 : "Orion Timberlands, LLC",
             700 : "Packaging Corporation of America",
             701 : "Parton Lumber Company",
             702 : "Pollard Lumber Company",
             703 : "Ponderay Newsprint",
             704 : "Port Townsend Paper Corporation",
             705 : "PROCURE LLC",
             706 : "Pyramid Mountain Lumber, Inc.",
             707 : "Rayonier Advanced Materials Wood Procurement LLC",
             708 : "ReEnergy Holdings LLC",
             709 : "Rex Lumber Company, LLC",
             710 : "Rock-Tenn Company",
             711 : "SAPPI North America (S.D. Warren Company)",
             712 : "Scotch & Gulf Lumber, LLC",
             713 : "Scotch Plywood Company, Inc.",
             714 : "Solvay Biomass Energy, LLC",
             715 : "Southern Veneer Products",
             716 : "Swanson Group Mfg. LLC",
             717 : "Tamarack Mill, LLC dba Evergreen Forest",
             718 : "The Port Townsend Group, Port Townsend Paper Corpo",
             719 : "Timber Products Company",
             720 : "Twin Rivers Paper Company, Woodlands & Procurement",
             721 : "Varn Wood Products, LLC",
             722 : "WD CHIPS LLC",
             723 : "Weaber, Inc.",
             724 : "West Fraser, Inc.",
             725 : "Woodland Pulp LLC",
             726 : "Zilkha Biomass Fuels I LLC"
        }

        $scope.addProducer = function(){

            if($scope.cs8Form.producerSource.$valid && $scope.cs8Form.percPurchased.$valid){

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

            if(confirm('Are you sure to delete this item ?')){
                $scope.cs8.primaryProducers.cs8.primaryProducers(index, 1);
            }
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
            if(confirm("Are you sure to delete this ?")){
                $scope.cs8.orgContacts.splice(index, 1);
            }

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
                        }


                        if(go){
                            $rootScope.goStep("cs9")
                        }

                    });
            }

        }

}]);
