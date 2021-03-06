/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v6.services.stub;

import com.google.ads.googleads.v6.resources.AdGroupExtensionSetting;
import com.google.ads.googleads.v6.services.GetAdGroupExtensionSettingRequest;
import com.google.ads.googleads.v6.services.MutateAdGroupExtensionSettingsRequest;
import com.google.ads.googleads.v6.services.MutateAdGroupExtensionSettingsResponse;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the AdGroupExtensionSettingService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAdGroupExtensionSettingServiceStub extends AdGroupExtensionSettingServiceStub {
  private static final MethodDescriptor<GetAdGroupExtensionSettingRequest, AdGroupExtensionSetting>
      getAdGroupExtensionSettingMethodDescriptor =
          MethodDescriptor.<GetAdGroupExtensionSettingRequest, AdGroupExtensionSetting>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdGroupExtensionSettingService/GetAdGroupExtensionSetting")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAdGroupExtensionSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AdGroupExtensionSetting.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
      mutateAdGroupExtensionSettingsMethodDescriptor =
          MethodDescriptor
              .<MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v6.services.AdGroupExtensionSettingService/MutateAdGroupExtensionSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(MutateAdGroupExtensionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      MutateAdGroupExtensionSettingsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAdGroupExtensionSettingRequest, AdGroupExtensionSetting>
      getAdGroupExtensionSettingCallable;
  private final UnaryCallable<
          MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
      mutateAdGroupExtensionSettingsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAdGroupExtensionSettingServiceStub create(
      AdGroupExtensionSettingServiceStubSettings settings) throws IOException {
    return new GrpcAdGroupExtensionSettingServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAdGroupExtensionSettingServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAdGroupExtensionSettingServiceStub(
        AdGroupExtensionSettingServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAdGroupExtensionSettingServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAdGroupExtensionSettingServiceStub(
        AdGroupExtensionSettingServiceStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  protected GrpcAdGroupExtensionSettingServiceStub(
      AdGroupExtensionSettingServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAdGroupExtensionSettingServiceCallableFactory());
  }

  protected GrpcAdGroupExtensionSettingServiceStub(
      AdGroupExtensionSettingServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAdGroupExtensionSettingRequest, AdGroupExtensionSetting>
        getAdGroupExtensionSettingTransportSettings =
            GrpcCallSettings
                .<GetAdGroupExtensionSettingRequest, AdGroupExtensionSetting>newBuilder()
                .setMethodDescriptor(getAdGroupExtensionSettingMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<GetAdGroupExtensionSettingRequest>() {
                      @Override
                      public Map<String, String> extract(
                          GetAdGroupExtensionSettingRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("resource_name", String.valueOf(request.getResourceName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
        mutateAdGroupExtensionSettingsTransportSettings =
            GrpcCallSettings
                .<MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
                    newBuilder()
                .setMethodDescriptor(mutateAdGroupExtensionSettingsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<MutateAdGroupExtensionSettingsRequest>() {
                      @Override
                      public Map<String, String> extract(
                          MutateAdGroupExtensionSettingsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("customer_id", String.valueOf(request.getCustomerId()));
                        return params.build();
                      }
                    })
                .build();

    this.getAdGroupExtensionSettingCallable =
        callableFactory.createUnaryCallable(
            getAdGroupExtensionSettingTransportSettings,
            settings.getAdGroupExtensionSettingSettings(),
            clientContext);
    this.mutateAdGroupExtensionSettingsCallable =
        callableFactory.createUnaryCallable(
            mutateAdGroupExtensionSettingsTransportSettings,
            settings.mutateAdGroupExtensionSettingsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<GetAdGroupExtensionSettingRequest, AdGroupExtensionSetting>
      getAdGroupExtensionSettingCallable() {
    return getAdGroupExtensionSettingCallable;
  }

  public UnaryCallable<
          MutateAdGroupExtensionSettingsRequest, MutateAdGroupExtensionSettingsResponse>
      mutateAdGroupExtensionSettingsCallable() {
    return mutateAdGroupExtensionSettingsCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
