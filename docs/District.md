

# District


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**districtContact** | [**DistrictContact**](DistrictContact.md) |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**lastSync** | **String** |  |  [optional] |
|**launchDate** | **LocalDate** |  |  [optional] |
|**lmsState** | [**LmsStateEnum**](#LmsStateEnum) |  |  [optional] |
|**loginMethods** | **List&lt;String&gt;** |  |  [optional] |
|**mdrNumber** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**ncesId** | **String** |  |  [optional] |
|**pauseEnd** | **String** |  |  [optional] |
|**pauseStart** | **String** |  |  [optional] |
|**portalUrl** | **String** |  |  [optional] |
|**sisType** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |



## Enum: LmsStateEnum

| Name | Value |
|---- | -----|
| MATCHING_IN_PROGRESS | &quot;matching_in_progress&quot; |
| ERROR | &quot;error&quot; |
| DISCONNECTED | &quot;disconnected&quot; |
| EMPTY | &quot;&quot; |
| SUCCESS | &quot;success&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;running&quot; |
| PENDING | &quot;pending&quot; |
| ERROR | &quot;error&quot; |
| PAUSED | &quot;paused&quot; |
| EMPTY | &quot;&quot; |
| SUCCESS | &quot;success&quot; |



