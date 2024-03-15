

# Student


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **String** |  |  [optional] |
|**credentials** | [**Credentials**](Credentials.md) |  |  [optional] |
|**disability** | [**Disability**](Disability.md) |  |  [optional] |
|**dob** | **String** |  |  [optional] |
|**ellStatus** | [**EllStatusEnum**](#EllStatusEnum) |  |  [optional] |
|**enrollments** | [**List&lt;SchoolEnrollment&gt;**](SchoolEnrollment.md) |  |  [optional] |
|**ext** | **Object** |  |  [optional] |
|**frlStatus** | [**FrlStatusEnum**](#FrlStatusEnum) |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**giftedStatus** | [**GiftedStatusEnum**](#GiftedStatusEnum) |  |  [optional] |
|**grade** | [**GradeEnum**](#GradeEnum) |  |  [optional] |
|**graduationYear** | **String** |  |  [optional] |
|**hispanicEthnicity** | [**HispanicEthnicityEnum**](#HispanicEthnicityEnum) |  |  [optional] |
|**homeLanguage** | [**HomeLanguageEnum**](#HomeLanguageEnum) |  |  [optional] |
|**homeLanguageCode** | [**HomeLanguageCodeEnum**](#HomeLanguageCodeEnum) |  |  [optional] |
|**iepStatus** | **String** |  |  [optional] |
|**lastModified** | **String** |  |  [optional] |
|**legacyId** | **String** |  |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**preferredName** | [**PreferredName**](PreferredName.md) |  |  [optional] |
|**race** | [**RaceEnum**](#RaceEnum) |  |  [optional] |
|**school** | **String** |  |  [optional] |
|**schools** | **List&lt;String&gt;** |  |  [optional] |
|**section504Status** | [**Section504StatusEnum**](#Section504StatusEnum) |  |  [optional] |
|**sisId** | **String** |  |  [optional] |
|**stateId** | **String** |  |  [optional] |
|**studentNumber** | **String** |  |  [optional] |



## Enum: EllStatusEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |
| EMPTY | &quot;&quot; |



## Enum: FrlStatusEnum

| Name | Value |
|---- | -----|
| FREE | &quot;Free&quot; |
| REDUCED | &quot;Reduced&quot; |
| PAID | &quot;Paid&quot; |
| OTHER | &quot;Other&quot; |
| EMPTY | &quot;&quot; |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| M | &quot;M&quot; |
| F | &quot;F&quot; |
| X | &quot;X&quot; |
| EMPTY | &quot;&quot; |



## Enum: GiftedStatusEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |
| EMPTY | &quot;&quot; |



## Enum: GradeEnum

| Name | Value |
|---- | -----|
| INFANTTODDLER | &quot;InfantToddler&quot; |
| PRESCHOOL | &quot;Preschool&quot; |
| PREKINDERGARTEN | &quot;PreKindergarten&quot; |
| TRANSITIONALKINDERGARTEN | &quot;TransitionalKindergarten&quot; |
| KINDERGARTEN | &quot;Kindergarten&quot; |
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _12 | &quot;12&quot; |
| _13 | &quot;13&quot; |
| POSTGRADUATE | &quot;PostGraduate&quot; |
| UNGRADED | &quot;Ungraded&quot; |
| OTHER | &quot;Other&quot; |
| EMPTY | &quot;&quot; |



## Enum: HispanicEthnicityEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |
| EMPTY | &quot;&quot; |



## Enum: HomeLanguageEnum

| Name | Value |
|---- | -----|
| BASQUE | &quot;Basque&quot; |
| PORTUGUESE | &quot;Portuguese&quot; |
| HUNGARIAN | &quot;Hungarian&quot; |
| HMONG | &quot;Hmong&quot; |
| URDU | &quot;Urdu&quot; |
| LATVIAN | &quot;Latvian&quot; |
| HAUSA | &quot;Hausa&quot; |
| SLOVENIAN | &quot;Slovenian&quot; |
| CHINESE_MANDARIN_ | &quot;Chinese (Mandarin)&quot; |
| RUSSIAN | &quot;Russian&quot; |
| ARABIC | &quot;Arabic&quot; |
| TELUGU | &quot;Telugu&quot; |
| AFRIKAANS | &quot;Afrikaans&quot; |
| TAMIL | &quot;Tamil&quot; |
| IRISH | &quot;Irish&quot; |
| UZBEK | &quot;Uzbek&quot; |
| NORWEGIAN | &quot;Norwegian&quot; |
| SERBIAN | &quot;Serbian&quot; |
| KHMER | &quot;Khmer&quot; |
| FARSI | &quot;Farsi&quot; |
| LAO | &quot;Lao&quot; |
| GUJARATI | &quot;Gujarati&quot; |
| YIDDISH | &quot;Yiddish&quot; |
| LITHUANIAN | &quot;Lithuanian&quot; |
| MONGOLIAN | &quot;Mongolian&quot; |
| SAMOAN | &quot;Samoan&quot; |
| BENGALI | &quot;Bengali&quot; |
| CORSICAN | &quot;Corsican&quot; |
| ROMANIAN | &quot;Romanian&quot; |
| JAVANESE | &quot;Javanese&quot; |
| DANISH | &quot;Danish&quot; |
| SCOTS_GAELIC | &quot;Scots Gaelic&quot; |
| BURMESE | &quot;Burmese&quot; |
| KINYARWANDA | &quot;Kinyarwanda&quot; |
| SWAHILI | &quot;Swahili&quot; |
| YORUBA | &quot;Yoruba&quot; |
| UYGHUR | &quot;Uyghur&quot; |
| HINDI | &quot;Hindi&quot; |
| AZERBAIJANI | &quot;Azerbaijani&quot; |
| CABO_VERDEAN | &quot;Cabo Verdean&quot; |
| HAITIAN_CREOLE | &quot;Haitian Creole&quot; |
| AMHARIC | &quot;Amharic&quot; |
| MAORI | &quot;Maori&quot; |
| SOMALI | &quot;Somali&quot; |
| ENGLISH | &quot;English&quot; |
| HAWAIIAN | &quot;Hawaiian&quot; |
| MALTESE | &quot;Maltese&quot; |
| THAI | &quot;Thai&quot; |
| SLOVAK | &quot;Slovak&quot; |
| NEPALI | &quot;Nepali&quot; |
| BOSNIAN | &quot;Bosnian&quot; |
| MARATHI | &quot;Marathi&quot; |
| FRISIAN | &quot;Frisian&quot; |
| SWEDISH | &quot;Swedish&quot; |
| KAZAKH | &quot;Kazakh&quot; |
| GERMAN | &quot;German&quot; |
| TURKISH | &quot;Turkish&quot; |
| CHINESE | &quot;Chinese&quot; |
| LUXEMBOURGISH | &quot;Luxembourgish&quot; |
| ARMENIAN | &quot;Armenian&quot; |
| DARI | &quot;Dari&quot; |
| MACEDONIAN | &quot;Macedonian&quot; |
| KAREN | &quot;Karen&quot; |
| ILOKO | &quot;Iloko&quot; |
| IGBO | &quot;Igbo&quot; |
| KANNADA | &quot;Kannada&quot; |
| GALICIAN | &quot;Galician&quot; |
| CEBUANO | &quot;Cebuano&quot; |
| PUNJABI | &quot;Punjabi&quot; |
| INDONESIAN | &quot;Indonesian&quot; |
| ESTONIAN | &quot;Estonian&quot; |
| ODIA | &quot;Odia&quot; |
| SPANISH | &quot;Spanish&quot; |
| FILIPINO | &quot;Filipino&quot; |
| ALBANIAN | &quot;Albanian&quot; |
| KOREAN | &quot;Korean&quot; |
| CROATIAN | &quot;Croatian&quot; |
| JAPANESE | &quot;Japanese&quot; |
| BULGARIAN | &quot;Bulgarian&quot; |
| CATALAN | &quot;Catalan&quot; |
| POLISH | &quot;Polish&quot; |
| SINHALA | &quot;Sinhala&quot; |
| OTHER | &quot;Other&quot; |
| ICELANDIC | &quot;Icelandic&quot; |
| TATAR | &quot;Tatar&quot; |
| UKRAINIAN | &quot;Ukrainian&quot; |
| TAJIK | &quot;Tajik&quot; |
| ITALIAN | &quot;Italian&quot; |
| FRENCH | &quot;French&quot; |
| MALAYALAM | &quot;Malayalam&quot; |
| CHICHEWA | &quot;Chichewa&quot; |
| KURDISH_KURMANJI_ | &quot;Kurdish (Kurmanji)&quot; |
| CZECH | &quot;Czech&quot; |
| XHOSA | &quot;Xhosa&quot; |
| HEBREW | &quot;Hebrew&quot; |
| GEORGIAN | &quot;Georgian&quot; |
| OROMO | &quot;Oromo&quot; |
| SHONA | &quot;Shona&quot; |
| SINDHI | &quot;Sindhi&quot; |
| SESOTHO | &quot;Sesotho&quot; |
| TAGALOG | &quot;Tagalog&quot; |
| MALAGASY | &quot;Malagasy&quot; |
| TIGRINYA | &quot;Tigrinya&quot; |
| WELSH | &quot;Welsh&quot; |
| TURKMEN | &quot;Turkmen&quot; |
| MALAY | &quot;Malay&quot; |
| MARSHALLESE | &quot;Marshallese&quot; |
| BELARUSIAN | &quot;Belarusian&quot; |
| DUTCH | &quot;Dutch&quot; |
| FINNISH | &quot;Finnish&quot; |
| GREEK | &quot;Greek&quot; |
| KYRGYZ | &quot;Kyrgyz&quot; |
| ZULU | &quot;Zulu&quot; |
| SUNDANESE | &quot;Sundanese&quot; |
| VIETNAMESE | &quot;Vietnamese&quot; |
| PASHTO | &quot;Pashto&quot; |



## Enum: HomeLanguageCodeEnum

| Name | Value |
|---- | -----|
| HAU | &quot;hau&quot; |
| ILO | &quot;ilo&quot; |
| DAN | &quot;dan&quot; |
| SOM | &quot;som&quot; |
| XHO | &quot;xho&quot; |
| SLV | &quot;slv&quot; |
| BOS | &quot;bos&quot; |
| COS | &quot;cos&quot; |
| CES | &quot;ces&quot; |
| MLG | &quot;mlg&quot; |
| VIE | &quot;vie&quot; |
| BEL | &quot;bel&quot; |
| HIN | &quot;hin&quot; |
| HUN | &quot;hun&quot; |
| MON | &quot;mon&quot; |
| PAN | &quot;pan&quot; |
| TGK | &quot;tgk&quot; |
| HEB | &quot;heb&quot; |
| PRS | &quot;prs&quot; |
| MLT | &quot;mlt&quot; |
| PUS | &quot;pus&quot; |
| TIR | &quot;tir&quot; |
| ENG | &quot;eng&quot; |
| MAR | &quot;mar&quot; |
| NLD | &quot;nld&quot; |
| EST | &quot;est&quot; |
| ZHO | &quot;zho&quot; |
| FAS | &quot;fas&quot; |
| FRY | &quot;fry&quot; |
| JPN | &quot;jpn&quot; |
| AZE | &quot;aze&quot; |
| RUS | &quot;rus&quot; |
| GLA | &quot;gla&quot; |
| YOR | &quot;yor&quot; |
| CMN | &quot;cmn&quot; |
| BUL | &quot;bul&quot; |
| FIN | &quot;fin&quot; |
| HMN | &quot;hmn&quot; |
| ITA | &quot;ita&quot; |
| POL | &quot;pol&quot; |
| ARA | &quot;ara&quot; |
| ELL | &quot;ell&quot; |
| KHM | &quot;khm&quot; |
| MKD | &quot;mkd&quot; |
| CPP | &quot;cpp&quot; |
| IBO | &quot;ibo&quot; |
| URD | &quot;urd&quot; |
| CYM | &quot;cym&quot; |
| HAT | &quot;hat&quot; |
| LAO | &quot;lao&quot; |
| LTZ | &quot;ltz&quot; |
| SND | &quot;snd&quot; |
| SWA | &quot;swa&quot; |
| MYA | &quot;mya&quot; |
| ORI | &quot;ori&quot; |
| KAT | &quot;kat&quot; |
| SMO | &quot;smo&quot; |
| SPA | &quot;spa&quot; |
| KOR | &quot;kor&quot; |
| NOB | &quot;nob&quot; |
| RON | &quot;ron&quot; |
| THA | &quot;tha&quot; |
| IND | &quot;ind&quot; |
| FRA | &quot;fra&quot; |
| TEL | &quot;tel&quot; |
| HYE | &quot;hye&quot; |
| GUJ | &quot;guj&quot; |
| ISL | &quot;isl&quot; |
| MSA | &quot;msa&quot; |
| SLK | &quot;slk&quot; |
| SWE | &quot;swe&quot; |
| TUK | &quot;tuk&quot; |
| EUS | &quot;eus&quot; |
| KAZ | &quot;kaz&quot; |
| MAL | &quot;mal&quot; |
| KAN | &quot;kan&quot; |
| AMH | &quot;amh&quot; |
| ORM | &quot;orm&quot; |
| AFR | &quot;afr&quot; |
| FIL | &quot;fil&quot; |
| HAW | &quot;haw&quot; |
| LAV | &quot;lav&quot; |
| SIN | &quot;sin&quot; |
| YID | &quot;yid&quot; |
| BEN | &quot;ben&quot; |
| KIR | &quot;kir&quot; |
| MRI | &quot;mri&quot; |
| TAM | &quot;tam&quot; |
| GLG | &quot;glg&quot; |
| CEB | &quot;ceb&quot; |
| TAT | &quot;tat&quot; |
| ZUL | &quot;zul&quot; |
| LIT | &quot;lit&quot; |
| NEP | &quot;nep&quot; |
| POR | &quot;por&quot; |
| SOT | &quot;sot&quot; |
| OTHER | &quot;other&quot; |
| NYA | &quot;nya&quot; |
| SUN | &quot;sun&quot; |
| CAT | &quot;cat&quot; |
| TGL | &quot;tgl&quot; |
| UKR | &quot;ukr&quot; |
| UZB | &quot;uzb&quot; |
| GLE | &quot;gle&quot; |
| SRP | &quot;srp&quot; |
| DEU | &quot;deu&quot; |
| JAV | &quot;jav&quot; |
| KUR | &quot;kur&quot; |
| MAH | &quot;mah&quot; |
| SNA | &quot;sna&quot; |
| UIG | &quot;uig&quot; |
| KIN | &quot;kin&quot; |
| HRV | &quot;hrv&quot; |
| KAR | &quot;kar&quot; |
| TUR | &quot;tur&quot; |
| SQI | &quot;sqi&quot; |



## Enum: RaceEnum

| Name | Value |
|---- | -----|
| CAUCASIAN | &quot;Caucasian&quot; |
| ASIAN | &quot;Asian&quot; |
| BLACK_OR_AFRICAN_AMERICAN | &quot;Black or African American&quot; |
| AMERICAN_INDIAN | &quot;American Indian&quot; |
| HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER | &quot;Hawaiian or Other Pacific Islander&quot; |
| TWO_OR_MORE_RACES | &quot;Two or More Races&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| EMPTY | &quot;&quot; |



## Enum: Section504StatusEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |
| EMPTY | &quot;&quot; |



