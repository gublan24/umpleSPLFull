/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/

package cruise.umple.compiler.java;

// line 1 "../../../../../UmpleTLTemplates/UmpleNotice.ump"
// line 2 "../../../../../UmpleTLTemplates/objectFactory_add_methods1.ump"
// line 2 "../../../../../UmpleTLTemplates/objectFactory_add_methods.ump"
// line 2 "../../../../../UmpleTLTemplates/objectFactory_add_DeclareDefault.ump"
// line 3 "../../../../../UmpleTLTemplates/objectFactory_add_DeclareOneToOne.ump"
// line 5 "../../../../../UmpleTLTemplates/objectFactory_add_Declare_All.ump"
// line 1 "../../../../../UmpleTLTemplates/uncaught_exception.ump"
// line 1 "../../../../../UmpleTLTemplates/objectFactory_listOfObjects_All.ump"
// line 1 "../../../../../UmpleTLTemplates/objectFactory_listOfObjects_instantiation_All.ump"
// line 1 "../../../../../UmpleTLTemplates/proxy_AbstractMethodDeclaration.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetMany_clear.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetOne_clear.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/specializationCode_Get.ump"
// line 12 "../../../../../UmpleTLTemplates/association_Get_All.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddIndexControlFunctions.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToOnlyOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMStarToMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMandatoryManyToOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToManyMethod.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddOptionalNToOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddOptionalNToOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMStar.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalOptionalN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_IsNumberOfValidMethod.ump"
// line 1 "../../../../../UmpleTLTemplates/association_MaximumNumberOfMethod.ump"
// line 1 "../../../../../UmpleTLTemplates/association_MinimumNumberOfMethod.ump"
// line 1 "../../../../../UmpleTLTemplates/association_RequiredNumberOfMethod.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetMNToMany.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetMNToOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetMStarToMany.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetNToOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToAtMostN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToMandatoryMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToManyAssociationClass.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalNToMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToMandatoryMN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToMandatoryMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToOptionalN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMStar.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalOptionalN.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/specializationCode_Set.ump"
// line 48 "../../../../../UmpleTLTemplates/association_Set_All.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_Get.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetCodeInjection.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetDefaulted.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetDefaultedCodeInjection.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetDefaultedSubclass.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetDerived.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetDerivedCodeInjection.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetDerivedSubclass.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetMany.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetManySubclass.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetUnique.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetUniqueCodeInjection.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetUniqueSubclass.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_GetSubclass.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_HasUnique.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_HasUniqueCodeInjection.ump"
// line 18 "../../../../../UmpleTLTemplates/attribute_Get_All.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_IsBoolean.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_IsBooleanCodeInjection.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_IsBooleanCodeInjectionDerived.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_IsBooleanDerived.ump"
// line 7 "../../../../../UmpleTLTemplates/attribute_IsBoolean_All.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_Set.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_SetDefaulted.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_SetDefaulted_subclass.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_SetImmutable.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_SetMany.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_SetMany_subclass.ump"
// line 1 "../../../../../UmpleTLTemplates/attribute_Set_subclass.ump"
// line 10 "../../../../../UmpleTLTemplates/attribute_Set_All.ump"
// line 1 "../../../../../UmpleTLTemplates/class_MethodDeclaration.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignImmutableOptionalMany.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignImmutableOptionalN.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignImmutableOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignMandatoryMany.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignOneToOne.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignUndirectionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeAssignImmutable.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeUnassignedImmutable.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_NestedStateMachineAssignDefault.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_Singleton.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_StateMachineAssignDefault.ump"
// line 23 "../../../../../UmpleTLTemplates/constructor_DeclareDefault.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignOne.ump"
// line 5 "../../../../../UmpleTLTemplates/constructor_AssociationAssignDefault.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationAssignOptionalMany.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AssociationCreateOneToOne.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeAssign.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeAssignAutounique.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeAssignUnique.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeAssignDefaulted.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeAssignLazy.ump"
// line 1 "../../../../../UmpleTLTemplates/constructor_AttributeAssignList.ump"
// line 13 "../../../../../UmpleTLTemplates/constructor_DeclareOneToOne.ump"
// line 1 "../../../../../UmpleTLTemplates/specializationCode_Constructor.ump"
// line 6 "../../../../../UmpleTLTemplates/constructor_Declare_All.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_MandatoryFromOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_MandatoryFromOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromMN.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromMN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromMN_specialization_relCommon.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromMany.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromX_comp.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_ManyFromX_comp_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OneFromMany.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OneFromMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OneFromOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OneFromOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OneFromOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OneFromOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMN.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMN_comp.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMN_comp_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMany.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMany_comp.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMany_comp_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromN.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromN_comp.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromN_comp_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromOne_comp.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromOne_comp_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromOptionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_OptionalOneFromOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_UndirectionalMany.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_UndirectionalMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_UndirectionalOne.ump"
// line 1 "../../../../../UmpleTLTemplates/delete_UndirectionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/specializationCode_Delete.ump"
// line 46 "../../../../../UmpleTLTemplates/delete_All.ump"
// line 1 "../../../../../UmpleTLTemplates/enumeration.ump"
// line 3 "../../../../../UmpleTLTemplates/enumerations_All.ump"
// line 1 "../../../../../UmpleTLTemplates/equals.ump"
// line 1 "../../../../../UmpleTLTemplates/import_packages.ump"
// line 1 "../../../../../UmpleTLTemplates/specializationCode.ump"
// line 4 "../../../../../UmpleTLTemplates/members_AllAssociations.ump"
// line 1 "../../../../../UmpleTLTemplates/members_AllAttributes.ump"
// line 1 "../../../../../UmpleTLTemplates/members_AllDoActivities.ump"
// line 4 "../../../../../UmpleTLTemplates/members_AllHelpers.ump"
// line 1 "../../../../../UmpleTLTemplates/members_AllStateMachines.ump"
// line 1 "../../../../../UmpleTLTemplates/members_AllStatics.ump"
// line 1 "../../../../../UmpleTLTemplates/queued_state_machine_inner_class.ump"
// line 1 "../../../../../UmpleTLTemplates/queued_state_machine_queuedEvent.ump"
// line 1 "../../../../../UmpleTLTemplates/queued_state_machine_removalThread_run.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_Event.ump"
// line 4 "../../../../../UmpleTLTemplates/state_machine_Events_All.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_Get.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_GetFull.ump"
// line 5 "../../../../../UmpleTLTemplates/state_machine_Get_All.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_Set.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_SetSimple.ump"
// line 5 "../../../../../UmpleTLTemplates/state_machine_Set_All.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_StateDependentMethods_All.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_doActivity.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_doActivityThread.ump"
// line 5 "../../../../../UmpleTLTemplates/state_machine_doActivity_All.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_Event_StartStopTimer.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_Event_StartStopTimer_NestedStates.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_timedEvent_run.ump"
// line 1 "../../../../../UmpleTLTemplates/state_machine_timedEvent_run_NestedStates.ump"
// line 5 "../../../../../UmpleTLTemplates/state_machine_timedEvent_Handler.ump"
// line 6 "../../../../../UmpleTLTemplates/state_machine_timedEvent_All.ump"
// line 1 "../../../../../UmpleTLTemplates/toString_declare.ump"
// line 1 "../../../../../UmpleTLTemplates/trace.ump"
// line 1 "../../../../../UmpleTLTemplates/queued_method.ump"
// line 1 "../../../../../UmpleTLTemplates/association_sorted_serializable_readObject.ump"
// line 1 "../../../../../UmpleTLTemplates/import_packages_interface.ump"
// line 1 "../../../../../UmpleTLTemplates/interface_AbstractMethodDeclaration.ump"
// line 1 "../../../../../UmpleTLTemplates/interface_constantDeclaration.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddIndexControlFunctions_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToOnlyOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToOptionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMStarToMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMandatoryManyToOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToManyMethod_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToOptionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddOptionalNToOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddOptionalNToOptionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMN_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMStar_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalOptionalN_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_IsNumberOfValidMethod_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_MaximumNumberOfMethod_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_MinimumNumberOfMethod_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_RemoveMany.ump"
// line 1 "../../../../../UmpleTLTemplates/association_RequiredNumberOfMethod_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetMNToMany_relatedSpecialization.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetMNToOptionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetMStarToMany_relatedSpecialization.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetNToOptionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToAtMostN_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToMandatoryMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToManyAssociationClass_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToMany_relatedSpecialization.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetOneToOptionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalNToMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToMandatoryMN_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToMandatoryMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToOptionalN_relatedSpecialization.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetOptionalOneToOptionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMN_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMStar_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMany_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalN_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalOne_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalOptionalN_relatedSpecialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalOptionalOne_relatedSpecialization.ump"
// line 47 "../../../../../UmpleTLTemplates/association_set_specialization_reqCommonCode.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddIndexControlFunctions_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToOnlyOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMNToOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMStarToMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddMandatoryManyToOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToManyMethod_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddManyToOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddOptionalNToOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddOptionalNToOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_AddUnidirectionalOptionalN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_IsNumberOfValidMethod_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_MaximumNumberOfMethod_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_MinimumNumberOfMethod_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_RequiredNumberOfMethod_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetMNToMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_GetPrivate.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetMNToOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetMStarToMany_specialization.ump"
// line 4 "../../../../../UmpleTLTemplates/association_SetNToOptionalOne_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToAtMostN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToMandatoryMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOneToMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalNToMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToMandatoryMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetOptionalOneToOptionalN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMStar_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalMany_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_SetUnidirectionalOptionalN_specialization.ump"
// line 1 "../../../../../UmpleTLTemplates/association_Sort.ump"
// line 1 "../../../../../UmpleTLTemplates/specializationSkip.ump"
// line 38 "../../../../../UmpleTLTemplates/association_set_specialization_reqSuperCode.ump"
public class UmpleToJava
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public UmpleToJava()
  {}

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {}

}