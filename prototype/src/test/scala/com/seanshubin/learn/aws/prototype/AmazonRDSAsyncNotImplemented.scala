package com.seanshubin.learn.aws.prototype

import java.util.concurrent.Future

import com.amazonaws.{AmazonWebServiceRequest, ResponseMetadata}
import com.amazonaws.handlers.AsyncHandler
import com.amazonaws.regions.Region
import com.amazonaws.services.rds.AmazonRDSAsync
import com.amazonaws.services.rds.model._
import com.amazonaws.services.rds.waiters.AmazonRDSWaiters

class AmazonRDSAsyncNotImplemented extends AmazonRDSAsync {
  override def describeReservedDBInstancesOfferingsAsync(describeReservedDBInstancesOfferingsRequest: DescribeReservedDBInstancesOfferingsRequest): Future[DescribeReservedDBInstancesOfferingsResult] = ???

  override def describeReservedDBInstancesOfferingsAsync(describeReservedDBInstancesOfferingsRequest: DescribeReservedDBInstancesOfferingsRequest, asyncHandler: AsyncHandler[DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult]): Future[DescribeReservedDBInstancesOfferingsResult] = ???

  override def describeReservedDBInstancesOfferingsAsync(): Future[DescribeReservedDBInstancesOfferingsResult] = ???

  override def describeReservedDBInstancesOfferingsAsync(asyncHandler: AsyncHandler[DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult]): Future[DescribeReservedDBInstancesOfferingsResult] = ???

  override def modifyDBClusterSnapshotAttributeAsync(modifyDBClusterSnapshotAttributeRequest: ModifyDBClusterSnapshotAttributeRequest): Future[DBClusterSnapshotAttributesResult] = ???

  override def modifyDBClusterSnapshotAttributeAsync(modifyDBClusterSnapshotAttributeRequest: ModifyDBClusterSnapshotAttributeRequest, asyncHandler: AsyncHandler[ModifyDBClusterSnapshotAttributeRequest, DBClusterSnapshotAttributesResult]): Future[DBClusterSnapshotAttributesResult] = ???

  override def promoteReadReplicaDBClusterAsync(promoteReadReplicaDBClusterRequest: PromoteReadReplicaDBClusterRequest): Future[DBCluster] = ???

  override def promoteReadReplicaDBClusterAsync(promoteReadReplicaDBClusterRequest: PromoteReadReplicaDBClusterRequest, asyncHandler: AsyncHandler[PromoteReadReplicaDBClusterRequest, DBCluster]): Future[DBCluster] = ???

  override def describeCertificatesAsync(describeCertificatesRequest: DescribeCertificatesRequest): Future[DescribeCertificatesResult] = ???

  override def describeCertificatesAsync(describeCertificatesRequest: DescribeCertificatesRequest, asyncHandler: AsyncHandler[DescribeCertificatesRequest, DescribeCertificatesResult]): Future[DescribeCertificatesResult] = ???

  override def describeCertificatesAsync(): Future[DescribeCertificatesResult] = ???

  override def describeCertificatesAsync(asyncHandler: AsyncHandler[DescribeCertificatesRequest, DescribeCertificatesResult]): Future[DescribeCertificatesResult] = ???

  override def copyDBSnapshotAsync(copyDBSnapshotRequest: CopyDBSnapshotRequest): Future[DBSnapshot] = ???

  override def copyDBSnapshotAsync(copyDBSnapshotRequest: CopyDBSnapshotRequest, asyncHandler: AsyncHandler[CopyDBSnapshotRequest, DBSnapshot]): Future[DBSnapshot] = ???

  override def describeDBParameterGroupsAsync(describeDBParameterGroupsRequest: DescribeDBParameterGroupsRequest): Future[DescribeDBParameterGroupsResult] = ???

  override def describeDBParameterGroupsAsync(describeDBParameterGroupsRequest: DescribeDBParameterGroupsRequest, asyncHandler: AsyncHandler[DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult]): Future[DescribeDBParameterGroupsResult] = ???

  override def describeDBParameterGroupsAsync(): Future[DescribeDBParameterGroupsResult] = ???

  override def describeDBParameterGroupsAsync(asyncHandler: AsyncHandler[DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult]): Future[DescribeDBParameterGroupsResult] = ???

  override def deleteDBSubnetGroupAsync(deleteDBSubnetGroupRequest: DeleteDBSubnetGroupRequest): Future[DeleteDBSubnetGroupResult] = ???

  override def deleteDBSubnetGroupAsync(deleteDBSubnetGroupRequest: DeleteDBSubnetGroupRequest, asyncHandler: AsyncHandler[DeleteDBSubnetGroupRequest, DeleteDBSubnetGroupResult]): Future[DeleteDBSubnetGroupResult] = ???

  override def describeDBInstancesAsync(describeDBInstancesRequest: DescribeDBInstancesRequest): Future[DescribeDBInstancesResult] = ???

  override def describeDBInstancesAsync(describeDBInstancesRequest: DescribeDBInstancesRequest, asyncHandler: AsyncHandler[DescribeDBInstancesRequest, DescribeDBInstancesResult]): Future[DescribeDBInstancesResult] = ???

  override def describeDBInstancesAsync(): Future[DescribeDBInstancesResult] = ???

  override def describeDBInstancesAsync(asyncHandler: AsyncHandler[DescribeDBInstancesRequest, DescribeDBInstancesResult]): Future[DescribeDBInstancesResult] = ???

  override def resetDBParameterGroupAsync(resetDBParameterGroupRequest: ResetDBParameterGroupRequest): Future[ResetDBParameterGroupResult] = ???

  override def resetDBParameterGroupAsync(resetDBParameterGroupRequest: ResetDBParameterGroupRequest, asyncHandler: AsyncHandler[ResetDBParameterGroupRequest, ResetDBParameterGroupResult]): Future[ResetDBParameterGroupResult] = ???

  override def describeAccountAttributesAsync(describeAccountAttributesRequest: DescribeAccountAttributesRequest): Future[DescribeAccountAttributesResult] = ???

  override def describeAccountAttributesAsync(describeAccountAttributesRequest: DescribeAccountAttributesRequest, asyncHandler: AsyncHandler[DescribeAccountAttributesRequest, DescribeAccountAttributesResult]): Future[DescribeAccountAttributesResult] = ???

  override def describeAccountAttributesAsync(): Future[DescribeAccountAttributesResult] = ???

  override def describeAccountAttributesAsync(asyncHandler: AsyncHandler[DescribeAccountAttributesRequest, DescribeAccountAttributesResult]): Future[DescribeAccountAttributesResult] = ???

  override def deleteDBSnapshotAsync(deleteDBSnapshotRequest: DeleteDBSnapshotRequest): Future[DBSnapshot] = ???

  override def deleteDBSnapshotAsync(deleteDBSnapshotRequest: DeleteDBSnapshotRequest, asyncHandler: AsyncHandler[DeleteDBSnapshotRequest, DBSnapshot]): Future[DBSnapshot] = ???

  override def describeDBClusterParametersAsync(describeDBClusterParametersRequest: DescribeDBClusterParametersRequest): Future[DescribeDBClusterParametersResult] = ???

  override def describeDBClusterParametersAsync(describeDBClusterParametersRequest: DescribeDBClusterParametersRequest, asyncHandler: AsyncHandler[DescribeDBClusterParametersRequest, DescribeDBClusterParametersResult]): Future[DescribeDBClusterParametersResult] = ???

  override def deleteEventSubscriptionAsync(deleteEventSubscriptionRequest: DeleteEventSubscriptionRequest): Future[EventSubscription] = ???

  override def deleteEventSubscriptionAsync(deleteEventSubscriptionRequest: DeleteEventSubscriptionRequest, asyncHandler: AsyncHandler[DeleteEventSubscriptionRequest, EventSubscription]): Future[EventSubscription] = ???

  override def modifyDBInstanceAsync(modifyDBInstanceRequest: ModifyDBInstanceRequest): Future[DBInstance] = ???

  override def modifyDBInstanceAsync(modifyDBInstanceRequest: ModifyDBInstanceRequest, asyncHandler: AsyncHandler[ModifyDBInstanceRequest, DBInstance]): Future[DBInstance] = ???

  override def deleteDBSecurityGroupAsync(deleteDBSecurityGroupRequest: DeleteDBSecurityGroupRequest): Future[DeleteDBSecurityGroupResult] = ???

  override def deleteDBSecurityGroupAsync(deleteDBSecurityGroupRequest: DeleteDBSecurityGroupRequest, asyncHandler: AsyncHandler[DeleteDBSecurityGroupRequest, DeleteDBSecurityGroupResult]): Future[DeleteDBSecurityGroupResult] = ???

  override def describeDBSecurityGroupsAsync(describeDBSecurityGroupsRequest: DescribeDBSecurityGroupsRequest): Future[DescribeDBSecurityGroupsResult] = ???

  override def describeDBSecurityGroupsAsync(describeDBSecurityGroupsRequest: DescribeDBSecurityGroupsRequest, asyncHandler: AsyncHandler[DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult]): Future[DescribeDBSecurityGroupsResult] = ???

  override def describeDBSecurityGroupsAsync(): Future[DescribeDBSecurityGroupsResult] = ???

  override def describeDBSecurityGroupsAsync(asyncHandler: AsyncHandler[DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult]): Future[DescribeDBSecurityGroupsResult] = ???

  override def modifyEventSubscriptionAsync(modifyEventSubscriptionRequest: ModifyEventSubscriptionRequest): Future[EventSubscription] = ???

  override def modifyEventSubscriptionAsync(modifyEventSubscriptionRequest: ModifyEventSubscriptionRequest, asyncHandler: AsyncHandler[ModifyEventSubscriptionRequest, EventSubscription]): Future[EventSubscription] = ???

  override def modifyDBSnapshotAsync(modifyDBSnapshotRequest: ModifyDBSnapshotRequest): Future[DBSnapshot] = ???

  override def modifyDBSnapshotAsync(modifyDBSnapshotRequest: ModifyDBSnapshotRequest, asyncHandler: AsyncHandler[ModifyDBSnapshotRequest, DBSnapshot]): Future[DBSnapshot] = ???

  override def addRoleToDBClusterAsync(addRoleToDBClusterRequest: AddRoleToDBClusterRequest): Future[AddRoleToDBClusterResult] = ???

  override def addRoleToDBClusterAsync(addRoleToDBClusterRequest: AddRoleToDBClusterRequest, asyncHandler: AsyncHandler[AddRoleToDBClusterRequest, AddRoleToDBClusterResult]): Future[AddRoleToDBClusterResult] = ???

  override def describeDBLogFilesAsync(describeDBLogFilesRequest: DescribeDBLogFilesRequest): Future[DescribeDBLogFilesResult] = ???

  override def describeDBLogFilesAsync(describeDBLogFilesRequest: DescribeDBLogFilesRequest, asyncHandler: AsyncHandler[DescribeDBLogFilesRequest, DescribeDBLogFilesResult]): Future[DescribeDBLogFilesResult] = ???

  override def describeEventSubscriptionsAsync(describeEventSubscriptionsRequest: DescribeEventSubscriptionsRequest): Future[DescribeEventSubscriptionsResult] = ???

  override def describeEventSubscriptionsAsync(describeEventSubscriptionsRequest: DescribeEventSubscriptionsRequest, asyncHandler: AsyncHandler[DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult]): Future[DescribeEventSubscriptionsResult] = ???

  override def describeEventSubscriptionsAsync(): Future[DescribeEventSubscriptionsResult] = ???

  override def describeEventSubscriptionsAsync(asyncHandler: AsyncHandler[DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult]): Future[DescribeEventSubscriptionsResult] = ???

  override def describeDBSnapshotsAsync(describeDBSnapshotsRequest: DescribeDBSnapshotsRequest): Future[DescribeDBSnapshotsResult] = ???

  override def describeDBSnapshotsAsync(describeDBSnapshotsRequest: DescribeDBSnapshotsRequest, asyncHandler: AsyncHandler[DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult]): Future[DescribeDBSnapshotsResult] = ???

  override def describeDBSnapshotsAsync(): Future[DescribeDBSnapshotsResult] = ???

  override def describeDBSnapshotsAsync(asyncHandler: AsyncHandler[DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult]): Future[DescribeDBSnapshotsResult] = ???

  override def startDBInstanceAsync(startDBInstanceRequest: StartDBInstanceRequest): Future[DBInstance] = ???

  override def startDBInstanceAsync(startDBInstanceRequest: StartDBInstanceRequest, asyncHandler: AsyncHandler[StartDBInstanceRequest, DBInstance]): Future[DBInstance] = ???

  override def removeSourceIdentifierFromSubscriptionAsync(removeSourceIdentifierFromSubscriptionRequest: RemoveSourceIdentifierFromSubscriptionRequest): Future[EventSubscription] = ???

  override def removeSourceIdentifierFromSubscriptionAsync(removeSourceIdentifierFromSubscriptionRequest: RemoveSourceIdentifierFromSubscriptionRequest, asyncHandler: AsyncHandler[RemoveSourceIdentifierFromSubscriptionRequest, EventSubscription]): Future[EventSubscription] = ???

  override def describeDBParametersAsync(describeDBParametersRequest: DescribeDBParametersRequest): Future[DescribeDBParametersResult] = ???

  override def describeDBParametersAsync(describeDBParametersRequest: DescribeDBParametersRequest, asyncHandler: AsyncHandler[DescribeDBParametersRequest, DescribeDBParametersResult]): Future[DescribeDBParametersResult] = ???

  override def createDBInstanceReadReplicaAsync(createDBInstanceReadReplicaRequest: CreateDBInstanceReadReplicaRequest): Future[DBInstance] = ???

  override def createDBInstanceReadReplicaAsync(createDBInstanceReadReplicaRequest: CreateDBInstanceReadReplicaRequest, asyncHandler: AsyncHandler[CreateDBInstanceReadReplicaRequest, DBInstance]): Future[DBInstance] = ???

  override def modifyDBClusterParameterGroupAsync(modifyDBClusterParameterGroupRequest: ModifyDBClusterParameterGroupRequest): Future[ModifyDBClusterParameterGroupResult] = ???

  override def modifyDBClusterParameterGroupAsync(modifyDBClusterParameterGroupRequest: ModifyDBClusterParameterGroupRequest, asyncHandler: AsyncHandler[ModifyDBClusterParameterGroupRequest, ModifyDBClusterParameterGroupResult]): Future[ModifyDBClusterParameterGroupResult] = ???

  override def resetDBClusterParameterGroupAsync(resetDBClusterParameterGroupRequest: ResetDBClusterParameterGroupRequest): Future[ResetDBClusterParameterGroupResult] = ???

  override def resetDBClusterParameterGroupAsync(resetDBClusterParameterGroupRequest: ResetDBClusterParameterGroupRequest, asyncHandler: AsyncHandler[ResetDBClusterParameterGroupRequest, ResetDBClusterParameterGroupResult]): Future[ResetDBClusterParameterGroupResult] = ???

  override def restoreDBClusterFromS3Async(restoreDBClusterFromS3Request: RestoreDBClusterFromS3Request): Future[DBCluster] = ???

  override def restoreDBClusterFromS3Async(restoreDBClusterFromS3Request: RestoreDBClusterFromS3Request, asyncHandler: AsyncHandler[RestoreDBClusterFromS3Request, DBCluster]): Future[DBCluster] = ???

  override def describeSourceRegionsAsync(describeSourceRegionsRequest: DescribeSourceRegionsRequest): Future[DescribeSourceRegionsResult] = ???

  override def describeSourceRegionsAsync(describeSourceRegionsRequest: DescribeSourceRegionsRequest, asyncHandler: AsyncHandler[DescribeSourceRegionsRequest, DescribeSourceRegionsResult]): Future[DescribeSourceRegionsResult] = ???

  override def createDBClusterParameterGroupAsync(createDBClusterParameterGroupRequest: CreateDBClusterParameterGroupRequest): Future[DBClusterParameterGroup] = ???

  override def createDBClusterParameterGroupAsync(createDBClusterParameterGroupRequest: CreateDBClusterParameterGroupRequest, asyncHandler: AsyncHandler[CreateDBClusterParameterGroupRequest, DBClusterParameterGroup]): Future[DBClusterParameterGroup] = ???

  override def deleteDBClusterParameterGroupAsync(deleteDBClusterParameterGroupRequest: DeleteDBClusterParameterGroupRequest): Future[DeleteDBClusterParameterGroupResult] = ???

  override def deleteDBClusterParameterGroupAsync(deleteDBClusterParameterGroupRequest: DeleteDBClusterParameterGroupRequest, asyncHandler: AsyncHandler[DeleteDBClusterParameterGroupRequest, DeleteDBClusterParameterGroupResult]): Future[DeleteDBClusterParameterGroupResult] = ???

  override def restoreDBClusterToPointInTimeAsync(restoreDBClusterToPointInTimeRequest: RestoreDBClusterToPointInTimeRequest): Future[DBCluster] = ???

  override def restoreDBClusterToPointInTimeAsync(restoreDBClusterToPointInTimeRequest: RestoreDBClusterToPointInTimeRequest, asyncHandler: AsyncHandler[RestoreDBClusterToPointInTimeRequest, DBCluster]): Future[DBCluster] = ???

  override def stopDBInstanceAsync(stopDBInstanceRequest: StopDBInstanceRequest): Future[DBInstance] = ???

  override def stopDBInstanceAsync(stopDBInstanceRequest: StopDBInstanceRequest, asyncHandler: AsyncHandler[StopDBInstanceRequest, DBInstance]): Future[DBInstance] = ???

  override def removeTagsFromResourceAsync(removeTagsFromResourceRequest: RemoveTagsFromResourceRequest): Future[RemoveTagsFromResourceResult] = ???

  override def removeTagsFromResourceAsync(removeTagsFromResourceRequest: RemoveTagsFromResourceRequest, asyncHandler: AsyncHandler[RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult]): Future[RemoveTagsFromResourceResult] = ???

  override def deleteDBClusterSnapshotAsync(deleteDBClusterSnapshotRequest: DeleteDBClusterSnapshotRequest): Future[DBClusterSnapshot] = ???

  override def deleteDBClusterSnapshotAsync(deleteDBClusterSnapshotRequest: DeleteDBClusterSnapshotRequest, asyncHandler: AsyncHandler[DeleteDBClusterSnapshotRequest, DBClusterSnapshot]): Future[DBClusterSnapshot] = ???

  override def promoteReadReplicaAsync(promoteReadReplicaRequest: PromoteReadReplicaRequest): Future[DBInstance] = ???

  override def promoteReadReplicaAsync(promoteReadReplicaRequest: PromoteReadReplicaRequest, asyncHandler: AsyncHandler[PromoteReadReplicaRequest, DBInstance]): Future[DBInstance] = ???

  override def describeEngineDefaultClusterParametersAsync(describeEngineDefaultClusterParametersRequest: DescribeEngineDefaultClusterParametersRequest): Future[EngineDefaults] = ???

  override def describeEngineDefaultClusterParametersAsync(describeEngineDefaultClusterParametersRequest: DescribeEngineDefaultClusterParametersRequest, asyncHandler: AsyncHandler[DescribeEngineDefaultClusterParametersRequest, EngineDefaults]): Future[EngineDefaults] = ???

  override def authorizeDBSecurityGroupIngressAsync(authorizeDBSecurityGroupIngressRequest: AuthorizeDBSecurityGroupIngressRequest): Future[DBSecurityGroup] = ???

  override def authorizeDBSecurityGroupIngressAsync(authorizeDBSecurityGroupIngressRequest: AuthorizeDBSecurityGroupIngressRequest, asyncHandler: AsyncHandler[AuthorizeDBSecurityGroupIngressRequest, DBSecurityGroup]): Future[DBSecurityGroup] = ???

  override def rebootDBInstanceAsync(rebootDBInstanceRequest: RebootDBInstanceRequest): Future[DBInstance] = ???

  override def rebootDBInstanceAsync(rebootDBInstanceRequest: RebootDBInstanceRequest, asyncHandler: AsyncHandler[RebootDBInstanceRequest, DBInstance]): Future[DBInstance] = ???

  override def describeEngineDefaultParametersAsync(describeEngineDefaultParametersRequest: DescribeEngineDefaultParametersRequest): Future[EngineDefaults] = ???

  override def describeEngineDefaultParametersAsync(describeEngineDefaultParametersRequest: DescribeEngineDefaultParametersRequest, asyncHandler: AsyncHandler[DescribeEngineDefaultParametersRequest, EngineDefaults]): Future[EngineDefaults] = ???

  override def describeReservedDBInstancesAsync(describeReservedDBInstancesRequest: DescribeReservedDBInstancesRequest): Future[DescribeReservedDBInstancesResult] = ???

  override def describeReservedDBInstancesAsync(describeReservedDBInstancesRequest: DescribeReservedDBInstancesRequest, asyncHandler: AsyncHandler[DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult]): Future[DescribeReservedDBInstancesResult] = ???

  override def describeReservedDBInstancesAsync(): Future[DescribeReservedDBInstancesResult] = ???

  override def describeReservedDBInstancesAsync(asyncHandler: AsyncHandler[DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult]): Future[DescribeReservedDBInstancesResult] = ???

  override def deleteOptionGroupAsync(deleteOptionGroupRequest: DeleteOptionGroupRequest): Future[DeleteOptionGroupResult] = ???

  override def deleteOptionGroupAsync(deleteOptionGroupRequest: DeleteOptionGroupRequest, asyncHandler: AsyncHandler[DeleteOptionGroupRequest, DeleteOptionGroupResult]): Future[DeleteOptionGroupResult] = ???

  override def describeDBClusterSnapshotsAsync(describeDBClusterSnapshotsRequest: DescribeDBClusterSnapshotsRequest): Future[DescribeDBClusterSnapshotsResult] = ???

  override def describeDBClusterSnapshotsAsync(describeDBClusterSnapshotsRequest: DescribeDBClusterSnapshotsRequest, asyncHandler: AsyncHandler[DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult]): Future[DescribeDBClusterSnapshotsResult] = ???

  override def describeDBClusterSnapshotsAsync(): Future[DescribeDBClusterSnapshotsResult] = ???

  override def describeDBClusterSnapshotsAsync(asyncHandler: AsyncHandler[DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult]): Future[DescribeDBClusterSnapshotsResult] = ???

  override def createDBClusterAsync(createDBClusterRequest: CreateDBClusterRequest): Future[DBCluster] = ???

  override def createDBClusterAsync(createDBClusterRequest: CreateDBClusterRequest, asyncHandler: AsyncHandler[CreateDBClusterRequest, DBCluster]): Future[DBCluster] = ???

  override def modifyDBClusterAsync(modifyDBClusterRequest: ModifyDBClusterRequest): Future[DBCluster] = ???

  override def modifyDBClusterAsync(modifyDBClusterRequest: ModifyDBClusterRequest, asyncHandler: AsyncHandler[ModifyDBClusterRequest, DBCluster]): Future[DBCluster] = ???

  override def createOptionGroupAsync(createOptionGroupRequest: CreateOptionGroupRequest): Future[OptionGroup] = ???

  override def createOptionGroupAsync(createOptionGroupRequest: CreateOptionGroupRequest, asyncHandler: AsyncHandler[CreateOptionGroupRequest, OptionGroup]): Future[OptionGroup] = ???

  override def createDBSecurityGroupAsync(createDBSecurityGroupRequest: CreateDBSecurityGroupRequest): Future[DBSecurityGroup] = ???

  override def createDBSecurityGroupAsync(createDBSecurityGroupRequest: CreateDBSecurityGroupRequest, asyncHandler: AsyncHandler[CreateDBSecurityGroupRequest, DBSecurityGroup]): Future[DBSecurityGroup] = ???

  override def describeValidDBInstanceModificationsAsync(describeValidDBInstanceModificationsRequest: DescribeValidDBInstanceModificationsRequest): Future[ValidDBInstanceModificationsMessage] = ???

  override def describeValidDBInstanceModificationsAsync(describeValidDBInstanceModificationsRequest: DescribeValidDBInstanceModificationsRequest, asyncHandler: AsyncHandler[DescribeValidDBInstanceModificationsRequest, ValidDBInstanceModificationsMessage]): Future[ValidDBInstanceModificationsMessage] = ???

  override def modifyDBParameterGroupAsync(modifyDBParameterGroupRequest: ModifyDBParameterGroupRequest): Future[ModifyDBParameterGroupResult] = ???

  override def modifyDBParameterGroupAsync(modifyDBParameterGroupRequest: ModifyDBParameterGroupRequest, asyncHandler: AsyncHandler[ModifyDBParameterGroupRequest, ModifyDBParameterGroupResult]): Future[ModifyDBParameterGroupResult] = ???

  override def describeOptionGroupsAsync(describeOptionGroupsRequest: DescribeOptionGroupsRequest): Future[DescribeOptionGroupsResult] = ???

  override def describeOptionGroupsAsync(describeOptionGroupsRequest: DescribeOptionGroupsRequest, asyncHandler: AsyncHandler[DescribeOptionGroupsRequest, DescribeOptionGroupsResult]): Future[DescribeOptionGroupsResult] = ???

  override def describeOptionGroupsAsync(): Future[DescribeOptionGroupsResult] = ???

  override def describeOptionGroupsAsync(asyncHandler: AsyncHandler[DescribeOptionGroupsRequest, DescribeOptionGroupsResult]): Future[DescribeOptionGroupsResult] = ???

  override def describeDBClusterParameterGroupsAsync(describeDBClusterParameterGroupsRequest: DescribeDBClusterParameterGroupsRequest): Future[DescribeDBClusterParameterGroupsResult] = ???

  override def describeDBClusterParameterGroupsAsync(describeDBClusterParameterGroupsRequest: DescribeDBClusterParameterGroupsRequest, asyncHandler: AsyncHandler[DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult]): Future[DescribeDBClusterParameterGroupsResult] = ???

  override def describeDBClusterParameterGroupsAsync(): Future[DescribeDBClusterParameterGroupsResult] = ???

  override def describeDBClusterParameterGroupsAsync(asyncHandler: AsyncHandler[DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult]): Future[DescribeDBClusterParameterGroupsResult] = ???

  override def describeEventsAsync(describeEventsRequest: DescribeEventsRequest): Future[DescribeEventsResult] = ???

  override def describeEventsAsync(describeEventsRequest: DescribeEventsRequest, asyncHandler: AsyncHandler[DescribeEventsRequest, DescribeEventsResult]): Future[DescribeEventsResult] = ???

  override def describeEventsAsync(): Future[DescribeEventsResult] = ???

  override def describeEventsAsync(asyncHandler: AsyncHandler[DescribeEventsRequest, DescribeEventsResult]): Future[DescribeEventsResult] = ???

  override def createDBParameterGroupAsync(createDBParameterGroupRequest: CreateDBParameterGroupRequest): Future[DBParameterGroup] = ???

  override def createDBParameterGroupAsync(createDBParameterGroupRequest: CreateDBParameterGroupRequest, asyncHandler: AsyncHandler[CreateDBParameterGroupRequest, DBParameterGroup]): Future[DBParameterGroup] = ???

  override def downloadDBLogFilePortionAsync(downloadDBLogFilePortionRequest: DownloadDBLogFilePortionRequest): Future[DownloadDBLogFilePortionResult] = ???

  override def downloadDBLogFilePortionAsync(downloadDBLogFilePortionRequest: DownloadDBLogFilePortionRequest, asyncHandler: AsyncHandler[DownloadDBLogFilePortionRequest, DownloadDBLogFilePortionResult]): Future[DownloadDBLogFilePortionResult] = ???

  override def restoreDBInstanceToPointInTimeAsync(restoreDBInstanceToPointInTimeRequest: RestoreDBInstanceToPointInTimeRequest): Future[DBInstance] = ???

  override def restoreDBInstanceToPointInTimeAsync(restoreDBInstanceToPointInTimeRequest: RestoreDBInstanceToPointInTimeRequest, asyncHandler: AsyncHandler[RestoreDBInstanceToPointInTimeRequest, DBInstance]): Future[DBInstance] = ???

  override def describeDBClusterSnapshotAttributesAsync(describeDBClusterSnapshotAttributesRequest: DescribeDBClusterSnapshotAttributesRequest): Future[DBClusterSnapshotAttributesResult] = ???

  override def describeDBClusterSnapshotAttributesAsync(describeDBClusterSnapshotAttributesRequest: DescribeDBClusterSnapshotAttributesRequest, asyncHandler: AsyncHandler[DescribeDBClusterSnapshotAttributesRequest, DBClusterSnapshotAttributesResult]): Future[DBClusterSnapshotAttributesResult] = ???

  override def deleteDBInstanceAsync(deleteDBInstanceRequest: DeleteDBInstanceRequest): Future[DBInstance] = ???

  override def deleteDBInstanceAsync(deleteDBInstanceRequest: DeleteDBInstanceRequest, asyncHandler: AsyncHandler[DeleteDBInstanceRequest, DBInstance]): Future[DBInstance] = ???

  override def describeDBClustersAsync(describeDBClustersRequest: DescribeDBClustersRequest): Future[DescribeDBClustersResult] = ???

  override def describeDBClustersAsync(describeDBClustersRequest: DescribeDBClustersRequest, asyncHandler: AsyncHandler[DescribeDBClustersRequest, DescribeDBClustersResult]): Future[DescribeDBClustersResult] = ???

  override def describeDBClustersAsync(): Future[DescribeDBClustersResult] = ???

  override def describeDBClustersAsync(asyncHandler: AsyncHandler[DescribeDBClustersRequest, DescribeDBClustersResult]): Future[DescribeDBClustersResult] = ???

  override def revokeDBSecurityGroupIngressAsync(revokeDBSecurityGroupIngressRequest: RevokeDBSecurityGroupIngressRequest): Future[DBSecurityGroup] = ???

  override def revokeDBSecurityGroupIngressAsync(revokeDBSecurityGroupIngressRequest: RevokeDBSecurityGroupIngressRequest, asyncHandler: AsyncHandler[RevokeDBSecurityGroupIngressRequest, DBSecurityGroup]): Future[DBSecurityGroup] = ???

  override def modifyDBSnapshotAttributeAsync(modifyDBSnapshotAttributeRequest: ModifyDBSnapshotAttributeRequest): Future[DBSnapshotAttributesResult] = ???

  override def modifyDBSnapshotAttributeAsync(modifyDBSnapshotAttributeRequest: ModifyDBSnapshotAttributeRequest, asyncHandler: AsyncHandler[ModifyDBSnapshotAttributeRequest, DBSnapshotAttributesResult]): Future[DBSnapshotAttributesResult] = ???

  override def deleteDBClusterAsync(deleteDBClusterRequest: DeleteDBClusterRequest): Future[DBCluster] = ???

  override def deleteDBClusterAsync(deleteDBClusterRequest: DeleteDBClusterRequest, asyncHandler: AsyncHandler[DeleteDBClusterRequest, DBCluster]): Future[DBCluster] = ???

  override def describePendingMaintenanceActionsAsync(describePendingMaintenanceActionsRequest: DescribePendingMaintenanceActionsRequest): Future[DescribePendingMaintenanceActionsResult] = ???

  override def describePendingMaintenanceActionsAsync(describePendingMaintenanceActionsRequest: DescribePendingMaintenanceActionsRequest, asyncHandler: AsyncHandler[DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult]): Future[DescribePendingMaintenanceActionsResult] = ???

  override def describePendingMaintenanceActionsAsync(): Future[DescribePendingMaintenanceActionsResult] = ???

  override def describePendingMaintenanceActionsAsync(asyncHandler: AsyncHandler[DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult]): Future[DescribePendingMaintenanceActionsResult] = ???

  override def describeDBSubnetGroupsAsync(describeDBSubnetGroupsRequest: DescribeDBSubnetGroupsRequest): Future[DescribeDBSubnetGroupsResult] = ???

  override def describeDBSubnetGroupsAsync(describeDBSubnetGroupsRequest: DescribeDBSubnetGroupsRequest, asyncHandler: AsyncHandler[DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult]): Future[DescribeDBSubnetGroupsResult] = ???

  override def describeDBSubnetGroupsAsync(): Future[DescribeDBSubnetGroupsResult] = ???

  override def describeDBSubnetGroupsAsync(asyncHandler: AsyncHandler[DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult]): Future[DescribeDBSubnetGroupsResult] = ???

  override def modifyOptionGroupAsync(modifyOptionGroupRequest: ModifyOptionGroupRequest): Future[OptionGroup] = ???

  override def modifyOptionGroupAsync(modifyOptionGroupRequest: ModifyOptionGroupRequest, asyncHandler: AsyncHandler[ModifyOptionGroupRequest, OptionGroup]): Future[OptionGroup] = ???

  override def copyDBClusterSnapshotAsync(copyDBClusterSnapshotRequest: CopyDBClusterSnapshotRequest): Future[DBClusterSnapshot] = ???

  override def copyDBClusterSnapshotAsync(copyDBClusterSnapshotRequest: CopyDBClusterSnapshotRequest, asyncHandler: AsyncHandler[CopyDBClusterSnapshotRequest, DBClusterSnapshot]): Future[DBClusterSnapshot] = ???

  override def listTagsForResourceAsync(listTagsForResourceRequest: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = ???

  override def listTagsForResourceAsync(listTagsForResourceRequest: ListTagsForResourceRequest, asyncHandler: AsyncHandler[ListTagsForResourceRequest, ListTagsForResourceResult]): Future[ListTagsForResourceResult] = ???

  override def createDBSubnetGroupAsync(createDBSubnetGroupRequest: CreateDBSubnetGroupRequest): Future[DBSubnetGroup] = ???

  override def createDBSubnetGroupAsync(createDBSubnetGroupRequest: CreateDBSubnetGroupRequest, asyncHandler: AsyncHandler[CreateDBSubnetGroupRequest, DBSubnetGroup]): Future[DBSubnetGroup] = ???

  override def restoreDBInstanceFromDBSnapshotAsync(restoreDBInstanceFromDBSnapshotRequest: RestoreDBInstanceFromDBSnapshotRequest): Future[DBInstance] = ???

  override def restoreDBInstanceFromDBSnapshotAsync(restoreDBInstanceFromDBSnapshotRequest: RestoreDBInstanceFromDBSnapshotRequest, asyncHandler: AsyncHandler[RestoreDBInstanceFromDBSnapshotRequest, DBInstance]): Future[DBInstance] = ???

  override def copyOptionGroupAsync(copyOptionGroupRequest: CopyOptionGroupRequest): Future[OptionGroup] = ???

  override def copyOptionGroupAsync(copyOptionGroupRequest: CopyOptionGroupRequest, asyncHandler: AsyncHandler[CopyOptionGroupRequest, OptionGroup]): Future[OptionGroup] = ???

  override def describeOrderableDBInstanceOptionsAsync(describeOrderableDBInstanceOptionsRequest: DescribeOrderableDBInstanceOptionsRequest): Future[DescribeOrderableDBInstanceOptionsResult] = ???

  override def describeOrderableDBInstanceOptionsAsync(describeOrderableDBInstanceOptionsRequest: DescribeOrderableDBInstanceOptionsRequest, asyncHandler: AsyncHandler[DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult]): Future[DescribeOrderableDBInstanceOptionsResult] = ???

  override def modifyDBSubnetGroupAsync(modifyDBSubnetGroupRequest: ModifyDBSubnetGroupRequest): Future[DBSubnetGroup] = ???

  override def modifyDBSubnetGroupAsync(modifyDBSubnetGroupRequest: ModifyDBSubnetGroupRequest, asyncHandler: AsyncHandler[ModifyDBSubnetGroupRequest, DBSubnetGroup]): Future[DBSubnetGroup] = ???

  override def describeDBSnapshotAttributesAsync(describeDBSnapshotAttributesRequest: DescribeDBSnapshotAttributesRequest): Future[DBSnapshotAttributesResult] = ???

  override def describeDBSnapshotAttributesAsync(describeDBSnapshotAttributesRequest: DescribeDBSnapshotAttributesRequest, asyncHandler: AsyncHandler[DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult]): Future[DBSnapshotAttributesResult] = ???

  override def describeDBSnapshotAttributesAsync(): Future[DBSnapshotAttributesResult] = ???

  override def describeDBSnapshotAttributesAsync(asyncHandler: AsyncHandler[DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult]): Future[DBSnapshotAttributesResult] = ???

  override def applyPendingMaintenanceActionAsync(applyPendingMaintenanceActionRequest: ApplyPendingMaintenanceActionRequest): Future[ResourcePendingMaintenanceActions] = ???

  override def applyPendingMaintenanceActionAsync(applyPendingMaintenanceActionRequest: ApplyPendingMaintenanceActionRequest, asyncHandler: AsyncHandler[ApplyPendingMaintenanceActionRequest, ResourcePendingMaintenanceActions]): Future[ResourcePendingMaintenanceActions] = ???

  override def restoreDBInstanceFromS3Async(restoreDBInstanceFromS3Request: RestoreDBInstanceFromS3Request): Future[DBInstance] = ???

  override def restoreDBInstanceFromS3Async(restoreDBInstanceFromS3Request: RestoreDBInstanceFromS3Request, asyncHandler: AsyncHandler[RestoreDBInstanceFromS3Request, DBInstance]): Future[DBInstance] = ???

  override def copyDBClusterParameterGroupAsync(copyDBClusterParameterGroupRequest: CopyDBClusterParameterGroupRequest): Future[DBClusterParameterGroup] = ???

  override def copyDBClusterParameterGroupAsync(copyDBClusterParameterGroupRequest: CopyDBClusterParameterGroupRequest, asyncHandler: AsyncHandler[CopyDBClusterParameterGroupRequest, DBClusterParameterGroup]): Future[DBClusterParameterGroup] = ???

  override def createDBSnapshotAsync(createDBSnapshotRequest: CreateDBSnapshotRequest): Future[DBSnapshot] = ???

  override def createDBSnapshotAsync(createDBSnapshotRequest: CreateDBSnapshotRequest, asyncHandler: AsyncHandler[CreateDBSnapshotRequest, DBSnapshot]): Future[DBSnapshot] = ???

  override def addTagsToResourceAsync(addTagsToResourceRequest: AddTagsToResourceRequest): Future[AddTagsToResourceResult] = ???

  override def addTagsToResourceAsync(addTagsToResourceRequest: AddTagsToResourceRequest, asyncHandler: AsyncHandler[AddTagsToResourceRequest, AddTagsToResourceResult]): Future[AddTagsToResourceResult] = ???

  override def restoreDBClusterFromSnapshotAsync(restoreDBClusterFromSnapshotRequest: RestoreDBClusterFromSnapshotRequest): Future[DBCluster] = ???

  override def restoreDBClusterFromSnapshotAsync(restoreDBClusterFromSnapshotRequest: RestoreDBClusterFromSnapshotRequest, asyncHandler: AsyncHandler[RestoreDBClusterFromSnapshotRequest, DBCluster]): Future[DBCluster] = ???

  override def createEventSubscriptionAsync(createEventSubscriptionRequest: CreateEventSubscriptionRequest): Future[EventSubscription] = ???

  override def createEventSubscriptionAsync(createEventSubscriptionRequest: CreateEventSubscriptionRequest, asyncHandler: AsyncHandler[CreateEventSubscriptionRequest, EventSubscription]): Future[EventSubscription] = ???

  override def describeDBEngineVersionsAsync(describeDBEngineVersionsRequest: DescribeDBEngineVersionsRequest): Future[DescribeDBEngineVersionsResult] = ???

  override def describeDBEngineVersionsAsync(describeDBEngineVersionsRequest: DescribeDBEngineVersionsRequest, asyncHandler: AsyncHandler[DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult]): Future[DescribeDBEngineVersionsResult] = ???

  override def describeDBEngineVersionsAsync(): Future[DescribeDBEngineVersionsResult] = ???

  override def describeDBEngineVersionsAsync(asyncHandler: AsyncHandler[DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult]): Future[DescribeDBEngineVersionsResult] = ???

  override def describeOptionGroupOptionsAsync(describeOptionGroupOptionsRequest: DescribeOptionGroupOptionsRequest): Future[DescribeOptionGroupOptionsResult] = ???

  override def describeOptionGroupOptionsAsync(describeOptionGroupOptionsRequest: DescribeOptionGroupOptionsRequest, asyncHandler: AsyncHandler[DescribeOptionGroupOptionsRequest, DescribeOptionGroupOptionsResult]): Future[DescribeOptionGroupOptionsResult] = ???

  override def createDBInstanceAsync(createDBInstanceRequest: CreateDBInstanceRequest): Future[DBInstance] = ???

  override def createDBInstanceAsync(createDBInstanceRequest: CreateDBInstanceRequest, asyncHandler: AsyncHandler[CreateDBInstanceRequest, DBInstance]): Future[DBInstance] = ???

  override def failoverDBClusterAsync(failoverDBClusterRequest: FailoverDBClusterRequest): Future[DBCluster] = ???

  override def failoverDBClusterAsync(failoverDBClusterRequest: FailoverDBClusterRequest, asyncHandler: AsyncHandler[FailoverDBClusterRequest, DBCluster]): Future[DBCluster] = ???

  override def failoverDBClusterAsync(): Future[DBCluster] = ???

  override def failoverDBClusterAsync(asyncHandler: AsyncHandler[FailoverDBClusterRequest, DBCluster]): Future[DBCluster] = ???

  override def purchaseReservedDBInstancesOfferingAsync(purchaseReservedDBInstancesOfferingRequest: PurchaseReservedDBInstancesOfferingRequest): Future[ReservedDBInstance] = ???

  override def purchaseReservedDBInstancesOfferingAsync(purchaseReservedDBInstancesOfferingRequest: PurchaseReservedDBInstancesOfferingRequest, asyncHandler: AsyncHandler[PurchaseReservedDBInstancesOfferingRequest, ReservedDBInstance]): Future[ReservedDBInstance] = ???

  override def deleteDBParameterGroupAsync(deleteDBParameterGroupRequest: DeleteDBParameterGroupRequest): Future[DeleteDBParameterGroupResult] = ???

  override def deleteDBParameterGroupAsync(deleteDBParameterGroupRequest: DeleteDBParameterGroupRequest, asyncHandler: AsyncHandler[DeleteDBParameterGroupRequest, DeleteDBParameterGroupResult]): Future[DeleteDBParameterGroupResult] = ???

  override def createDBClusterSnapshotAsync(createDBClusterSnapshotRequest: CreateDBClusterSnapshotRequest): Future[DBClusterSnapshot] = ???

  override def createDBClusterSnapshotAsync(createDBClusterSnapshotRequest: CreateDBClusterSnapshotRequest, asyncHandler: AsyncHandler[CreateDBClusterSnapshotRequest, DBClusterSnapshot]): Future[DBClusterSnapshot] = ???

  override def addSourceIdentifierToSubscriptionAsync(addSourceIdentifierToSubscriptionRequest: AddSourceIdentifierToSubscriptionRequest): Future[EventSubscription] = ???

  override def addSourceIdentifierToSubscriptionAsync(addSourceIdentifierToSubscriptionRequest: AddSourceIdentifierToSubscriptionRequest, asyncHandler: AsyncHandler[AddSourceIdentifierToSubscriptionRequest, EventSubscription]): Future[EventSubscription] = ???

  override def copyDBParameterGroupAsync(copyDBParameterGroupRequest: CopyDBParameterGroupRequest): Future[DBParameterGroup] = ???

  override def copyDBParameterGroupAsync(copyDBParameterGroupRequest: CopyDBParameterGroupRequest, asyncHandler: AsyncHandler[CopyDBParameterGroupRequest, DBParameterGroup]): Future[DBParameterGroup] = ???

  override def describeEventCategoriesAsync(describeEventCategoriesRequest: DescribeEventCategoriesRequest): Future[DescribeEventCategoriesResult] = ???

  override def describeEventCategoriesAsync(describeEventCategoriesRequest: DescribeEventCategoriesRequest, asyncHandler: AsyncHandler[DescribeEventCategoriesRequest, DescribeEventCategoriesResult]): Future[DescribeEventCategoriesResult] = ???

  override def describeEventCategoriesAsync(): Future[DescribeEventCategoriesResult] = ???

  override def describeEventCategoriesAsync(asyncHandler: AsyncHandler[DescribeEventCategoriesRequest, DescribeEventCategoriesResult]): Future[DescribeEventCategoriesResult] = ???

  override def removeRoleFromDBClusterAsync(removeRoleFromDBClusterRequest: RemoveRoleFromDBClusterRequest): Future[RemoveRoleFromDBClusterResult] = ???

  override def removeRoleFromDBClusterAsync(removeRoleFromDBClusterRequest: RemoveRoleFromDBClusterRequest, asyncHandler: AsyncHandler[RemoveRoleFromDBClusterRequest, RemoveRoleFromDBClusterResult]): Future[RemoveRoleFromDBClusterResult] = ???

  override def createOptionGroup(createOptionGroupRequest: CreateOptionGroupRequest): OptionGroup = ???

  override def modifyDBSnapshotAttribute(modifyDBSnapshotAttributeRequest: ModifyDBSnapshotAttributeRequest): DBSnapshotAttributesResult = ???

  override def authorizeDBSecurityGroupIngress(authorizeDBSecurityGroupIngressRequest: AuthorizeDBSecurityGroupIngressRequest): DBSecurityGroup = ???

  override def describeEvents(describeEventsRequest: DescribeEventsRequest): DescribeEventsResult = ???

  override def describeEvents(): DescribeEventsResult = ???

  override def deleteDBParameterGroup(deleteDBParameterGroupRequest: DeleteDBParameterGroupRequest): DeleteDBParameterGroupResult = ???

  override def restoreDBClusterFromS3(restoreDBClusterFromS3Request: RestoreDBClusterFromS3Request): DBCluster = ???

  override def describeDBEngineVersions(describeDBEngineVersionsRequest: DescribeDBEngineVersionsRequest): DescribeDBEngineVersionsResult = ???

  override def describeDBEngineVersions(): DescribeDBEngineVersionsResult = ???

  override def modifyDBSubnetGroup(modifyDBSubnetGroupRequest: ModifyDBSubnetGroupRequest): DBSubnetGroup = ???

  override def deleteDBClusterParameterGroup(deleteDBClusterParameterGroupRequest: DeleteDBClusterParameterGroupRequest): DeleteDBClusterParameterGroupResult = ???

  override def promoteReadReplica(promoteReadReplicaRequest: PromoteReadReplicaRequest): DBInstance = ???

  override def describeDBClusterSnapshotAttributes(describeDBClusterSnapshotAttributesRequest: DescribeDBClusterSnapshotAttributesRequest): DBClusterSnapshotAttributesResult = ???

  override def setEndpoint(endpoint: String): Unit = ???

  override def copyOptionGroup(copyOptionGroupRequest: CopyOptionGroupRequest): OptionGroup = ???

  override def addSourceIdentifierToSubscription(addSourceIdentifierToSubscriptionRequest: AddSourceIdentifierToSubscriptionRequest): EventSubscription = ???

  override def addTagsToResource(addTagsToResourceRequest: AddTagsToResourceRequest): AddTagsToResourceResult = ???

  override def createDBParameterGroup(createDBParameterGroupRequest: CreateDBParameterGroupRequest): DBParameterGroup = ???

  override def describeDBInstances(describeDBInstancesRequest: DescribeDBInstancesRequest): DescribeDBInstancesResult = ???

  override def describeDBInstances(): DescribeDBInstancesResult = ???

  override def resetDBClusterParameterGroup(resetDBClusterParameterGroupRequest: ResetDBClusterParameterGroupRequest): ResetDBClusterParameterGroupResult = ???

  override def copyDBClusterParameterGroup(copyDBClusterParameterGroupRequest: CopyDBClusterParameterGroupRequest): DBClusterParameterGroup = ???

  override def describeDBSecurityGroups(describeDBSecurityGroupsRequest: DescribeDBSecurityGroupsRequest): DescribeDBSecurityGroupsResult = ???

  override def describeDBSecurityGroups(): DescribeDBSecurityGroupsResult = ???

  override def restoreDBInstanceToPointInTime(restoreDBInstanceToPointInTimeRequest: RestoreDBInstanceToPointInTimeRequest): DBInstance = ???

  override def describeEngineDefaultClusterParameters(describeEngineDefaultClusterParametersRequest: DescribeEngineDefaultClusterParametersRequest): EngineDefaults = ???

  override def createDBCluster(createDBClusterRequest: CreateDBClusterRequest): DBCluster = ???

  override def stopDBInstance(stopDBInstanceRequest: StopDBInstanceRequest): DBInstance = ???

  override def modifyDBClusterParameterGroup(modifyDBClusterParameterGroupRequest: ModifyDBClusterParameterGroupRequest): ModifyDBClusterParameterGroupResult = ???

  override def deleteDBClusterSnapshot(deleteDBClusterSnapshotRequest: DeleteDBClusterSnapshotRequest): DBClusterSnapshot = ???

  override def listTagsForResource(listTagsForResourceRequest: ListTagsForResourceRequest): ListTagsForResourceResult = ???

  override def describeCertificates(describeCertificatesRequest: DescribeCertificatesRequest): DescribeCertificatesResult = ???

  override def describeCertificates(): DescribeCertificatesResult = ???

  override def describeOptionGroups(describeOptionGroupsRequest: DescribeOptionGroupsRequest): DescribeOptionGroupsResult = ???

  override def describeOptionGroups(): DescribeOptionGroupsResult = ???

  override def modifyDBParameterGroup(modifyDBParameterGroupRequest: ModifyDBParameterGroupRequest): ModifyDBParameterGroupResult = ???

  override def createEventSubscription(createEventSubscriptionRequest: CreateEventSubscriptionRequest): EventSubscription = ???

  override def createDBSecurityGroup(createDBSecurityGroupRequest: CreateDBSecurityGroupRequest): DBSecurityGroup = ???

  override def deleteDBCluster(deleteDBClusterRequest: DeleteDBClusterRequest): DBCluster = ???

  override def deleteDBSnapshot(deleteDBSnapshotRequest: DeleteDBSnapshotRequest): DBSnapshot = ???

  override def describeOrderableDBInstanceOptions(describeOrderableDBInstanceOptionsRequest: DescribeOrderableDBInstanceOptionsRequest): DescribeOrderableDBInstanceOptionsResult = ???

  override def describeDBParameters(describeDBParametersRequest: DescribeDBParametersRequest): DescribeDBParametersResult = ???

  override def restoreDBInstanceFromDBSnapshot(restoreDBInstanceFromDBSnapshotRequest: RestoreDBInstanceFromDBSnapshotRequest): DBInstance = ???

  override def describeValidDBInstanceModifications(describeValidDBInstanceModificationsRequest: DescribeValidDBInstanceModificationsRequest): ValidDBInstanceModificationsMessage = ???

  override def describeDBSnapshotAttributes(describeDBSnapshotAttributesRequest: DescribeDBSnapshotAttributesRequest): DBSnapshotAttributesResult = ???

  override def describeDBSnapshotAttributes(): DBSnapshotAttributesResult = ???

  override def describeDBSubnetGroups(describeDBSubnetGroupsRequest: DescribeDBSubnetGroupsRequest): DescribeDBSubnetGroupsResult = ???

  override def describeDBSubnetGroups(): DescribeDBSubnetGroupsResult = ???

  override def describeDBClusters(describeDBClustersRequest: DescribeDBClustersRequest): DescribeDBClustersResult = ???

  override def describeDBClusters(): DescribeDBClustersResult = ???

  override def describeDBSnapshots(describeDBSnapshotsRequest: DescribeDBSnapshotsRequest): DescribeDBSnapshotsResult = ???

  override def describeDBSnapshots(): DescribeDBSnapshotsResult = ???

  override def modifyDBSnapshot(modifyDBSnapshotRequest: ModifyDBSnapshotRequest): DBSnapshot = ???

  override def describeOptionGroupOptions(describeOptionGroupOptionsRequest: DescribeOptionGroupOptionsRequest): DescribeOptionGroupOptionsResult = ???

  override def modifyDBClusterSnapshotAttribute(modifyDBClusterSnapshotAttributeRequest: ModifyDBClusterSnapshotAttributeRequest): DBClusterSnapshotAttributesResult = ???

  override def addRoleToDBCluster(addRoleToDBClusterRequest: AddRoleToDBClusterRequest): AddRoleToDBClusterResult = ???

  override def copyDBSnapshot(copyDBSnapshotRequest: CopyDBSnapshotRequest): DBSnapshot = ???

  override def describePendingMaintenanceActions(describePendingMaintenanceActionsRequest: DescribePendingMaintenanceActionsRequest): DescribePendingMaintenanceActionsResult = ???

  override def describePendingMaintenanceActions(): DescribePendingMaintenanceActionsResult = ???

  override def describeEngineDefaultParameters(describeEngineDefaultParametersRequest: DescribeEngineDefaultParametersRequest): EngineDefaults = ???

  override def getCachedResponseMetadata(request: AmazonWebServiceRequest): ResponseMetadata = ???

  override def describeDBParameterGroups(describeDBParameterGroupsRequest: DescribeDBParameterGroupsRequest): DescribeDBParameterGroupsResult = ???

  override def describeDBParameterGroups(): DescribeDBParameterGroupsResult = ???

  override def restoreDBInstanceFromS3(restoreDBInstanceFromS3Request: RestoreDBInstanceFromS3Request): DBInstance = ???

  override def resetDBParameterGroup(resetDBParameterGroupRequest: ResetDBParameterGroupRequest): ResetDBParameterGroupResult = ???

  override def purchaseReservedDBInstancesOffering(purchaseReservedDBInstancesOfferingRequest: PurchaseReservedDBInstancesOfferingRequest): ReservedDBInstance = ???

  override def removeSourceIdentifierFromSubscription(removeSourceIdentifierFromSubscriptionRequest: RemoveSourceIdentifierFromSubscriptionRequest): EventSubscription = ???

  override def createDBInstance(createDBInstanceRequest: CreateDBInstanceRequest): DBInstance = ???

  override def restoreDBClusterFromSnapshot(restoreDBClusterFromSnapshotRequest: RestoreDBClusterFromSnapshotRequest): DBCluster = ???

  override def describeReservedDBInstances(describeReservedDBInstancesRequest: DescribeReservedDBInstancesRequest): DescribeReservedDBInstancesResult = ???

  override def describeReservedDBInstances(): DescribeReservedDBInstancesResult = ???

  override def describeReservedDBInstancesOfferings(describeReservedDBInstancesOfferingsRequest: DescribeReservedDBInstancesOfferingsRequest): DescribeReservedDBInstancesOfferingsResult = ???

  override def describeReservedDBInstancesOfferings(): DescribeReservedDBInstancesOfferingsResult = ???

  override def modifyEventSubscription(modifyEventSubscriptionRequest: ModifyEventSubscriptionRequest): EventSubscription = ???

  override def revokeDBSecurityGroupIngress(revokeDBSecurityGroupIngressRequest: RevokeDBSecurityGroupIngressRequest): DBSecurityGroup = ???

  override def waiters(): AmazonRDSWaiters = ???

  override def promoteReadReplicaDBCluster(promoteReadReplicaDBClusterRequest: PromoteReadReplicaDBClusterRequest): DBCluster = ???

  override def createDBInstanceReadReplica(createDBInstanceReadReplicaRequest: CreateDBInstanceReadReplicaRequest): DBInstance = ???

  override def deleteDBSecurityGroup(deleteDBSecurityGroupRequest: DeleteDBSecurityGroupRequest): DeleteDBSecurityGroupResult = ???

  override def setRegion(region: Region): Unit = ???

  override def rebootDBInstance(rebootDBInstanceRequest: RebootDBInstanceRequest): DBInstance = ???

  override def restoreDBClusterToPointInTime(restoreDBClusterToPointInTimeRequest: RestoreDBClusterToPointInTimeRequest): DBCluster = ???

  override def createDBClusterParameterGroup(createDBClusterParameterGroupRequest: CreateDBClusterParameterGroupRequest): DBClusterParameterGroup = ???

  override def createDBSubnetGroup(createDBSubnetGroupRequest: CreateDBSubnetGroupRequest): DBSubnetGroup = ???

  override def failoverDBCluster(failoverDBClusterRequest: FailoverDBClusterRequest): DBCluster = ???

  override def failoverDBCluster(): DBCluster = ???

  override def deleteOptionGroup(deleteOptionGroupRequest: DeleteOptionGroupRequest): DeleteOptionGroupResult = ???

  override def createDBClusterSnapshot(createDBClusterSnapshotRequest: CreateDBClusterSnapshotRequest): DBClusterSnapshot = ???

  override def deleteDBInstance(deleteDBInstanceRequest: DeleteDBInstanceRequest): DBInstance = ???

  override def copyDBClusterSnapshot(copyDBClusterSnapshotRequest: CopyDBClusterSnapshotRequest): DBClusterSnapshot = ???

  override def copyDBParameterGroup(copyDBParameterGroupRequest: CopyDBParameterGroupRequest): DBParameterGroup = ???

  override def deleteDBSubnetGroup(deleteDBSubnetGroupRequest: DeleteDBSubnetGroupRequest): DeleteDBSubnetGroupResult = ???

  override def startDBInstance(startDBInstanceRequest: StartDBInstanceRequest): DBInstance = ???

  override def createDBSnapshot(createDBSnapshotRequest: CreateDBSnapshotRequest): DBSnapshot = ???

  override def describeDBClusterParameters(describeDBClusterParametersRequest: DescribeDBClusterParametersRequest): DescribeDBClusterParametersResult = ???

  override def applyPendingMaintenanceAction(applyPendingMaintenanceActionRequest: ApplyPendingMaintenanceActionRequest): ResourcePendingMaintenanceActions = ???

  override def shutdown(): Unit = ???

  override def removeTagsFromResource(removeTagsFromResourceRequest: RemoveTagsFromResourceRequest): RemoveTagsFromResourceResult = ???

  override def modifyDBCluster(modifyDBClusterRequest: ModifyDBClusterRequest): DBCluster = ???

  override def deleteEventSubscription(deleteEventSubscriptionRequest: DeleteEventSubscriptionRequest): EventSubscription = ???

  override def describeDBClusterParameterGroups(describeDBClusterParameterGroupsRequest: DescribeDBClusterParameterGroupsRequest): DescribeDBClusterParameterGroupsResult = ???

  override def describeDBClusterParameterGroups(): DescribeDBClusterParameterGroupsResult = ???

  override def modifyOptionGroup(modifyOptionGroupRequest: ModifyOptionGroupRequest): OptionGroup = ???

  override def describeEventCategories(describeEventCategoriesRequest: DescribeEventCategoriesRequest): DescribeEventCategoriesResult = ???

  override def describeEventCategories(): DescribeEventCategoriesResult = ???

  override def describeSourceRegions(describeSourceRegionsRequest: DescribeSourceRegionsRequest): DescribeSourceRegionsResult = ???

  override def describeDBClusterSnapshots(describeDBClusterSnapshotsRequest: DescribeDBClusterSnapshotsRequest): DescribeDBClusterSnapshotsResult = ???

  override def describeDBClusterSnapshots(): DescribeDBClusterSnapshotsResult = ???

  override def describeEventSubscriptions(describeEventSubscriptionsRequest: DescribeEventSubscriptionsRequest): DescribeEventSubscriptionsResult = ???

  override def describeEventSubscriptions(): DescribeEventSubscriptionsResult = ???

  override def modifyDBInstance(modifyDBInstanceRequest: ModifyDBInstanceRequest): DBInstance = ???

  override def removeRoleFromDBCluster(removeRoleFromDBClusterRequest: RemoveRoleFromDBClusterRequest): RemoveRoleFromDBClusterResult = ???

  override def downloadDBLogFilePortion(downloadDBLogFilePortionRequest: DownloadDBLogFilePortionRequest): DownloadDBLogFilePortionResult = ???

  override def describeDBLogFiles(describeDBLogFilesRequest: DescribeDBLogFilesRequest): DescribeDBLogFilesResult = ???

  override def describeAccountAttributes(describeAccountAttributesRequest: DescribeAccountAttributesRequest): DescribeAccountAttributesResult = ???

  override def describeAccountAttributes(): DescribeAccountAttributesResult = ???
}
