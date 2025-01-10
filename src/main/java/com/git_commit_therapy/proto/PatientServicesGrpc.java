package com.git_commit_therapy.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: patient_services.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PatientServicesGrpc {

  private PatientServicesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.git_commit_therapy.proto.PatientServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Patient> getGetPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatient",
      requestType = com.google.protobuf.Empty.class,
      responseType = UserOuterClass.Patient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      UserOuterClass.Patient> getGetPatientMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, UserOuterClass.Patient> getGetPatientMethod;
    if ((getGetPatientMethod = PatientServicesGrpc.getGetPatientMethod) == null) {
      synchronized (PatientServicesGrpc.class) {
        if ((getGetPatientMethod = PatientServicesGrpc.getGetPatientMethod) == null) {
          PatientServicesGrpc.getGetPatientMethod = getGetPatientMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, UserOuterClass.Patient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserOuterClass.Patient.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServicesMethodDescriptorSupplier("GetPatient"))
              .build();
        }
      }
    }
    return getGetPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAppointmentsRequest,
      PatientServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointments",
      requestType = PatientServicesOuterClass.GetAppointmentsRequest.class,
      responseType = PatientServicesOuterClass.GetAppointmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAppointmentsRequest,
      PatientServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod() {
    io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAppointmentsRequest, PatientServicesOuterClass.GetAppointmentsResponse> getGetAppointmentsMethod;
    if ((getGetAppointmentsMethod = PatientServicesGrpc.getGetAppointmentsMethod) == null) {
      synchronized (PatientServicesGrpc.class) {
        if ((getGetAppointmentsMethod = PatientServicesGrpc.getGetAppointmentsMethod) == null) {
          PatientServicesGrpc.getGetAppointmentsMethod = getGetAppointmentsMethod =
              io.grpc.MethodDescriptor.<PatientServicesOuterClass.GetAppointmentsRequest, PatientServicesOuterClass.GetAppointmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetAppointmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetAppointmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServicesMethodDescriptorSupplier("GetAppointments"))
              .build();
        }
      }
    }
    return getGetAppointmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      PatientServicesOuterClass.GetMedicalInfoResponse> getGetAllMedicalInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMedicalInfo",
      requestType = com.google.protobuf.Empty.class,
      responseType = PatientServicesOuterClass.GetMedicalInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      PatientServicesOuterClass.GetMedicalInfoResponse> getGetAllMedicalInfoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, PatientServicesOuterClass.GetMedicalInfoResponse> getGetAllMedicalInfoMethod;
    if ((getGetAllMedicalInfoMethod = PatientServicesGrpc.getGetAllMedicalInfoMethod) == null) {
      synchronized (PatientServicesGrpc.class) {
        if ((getGetAllMedicalInfoMethod = PatientServicesGrpc.getGetAllMedicalInfoMethod) == null) {
          PatientServicesGrpc.getGetAllMedicalInfoMethod = getGetAllMedicalInfoMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, PatientServicesOuterClass.GetMedicalInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMedicalInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetMedicalInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServicesMethodDescriptorSupplier("GetAllMedicalInfo"))
              .build();
        }
      }
    }
    return getGetAllMedicalInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAllMedicalEventRequest,
      PatientServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMedicalEvent",
      requestType = PatientServicesOuterClass.GetAllMedicalEventRequest.class,
      responseType = PatientServicesOuterClass.GetAllMedicalEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAllMedicalEventRequest,
      PatientServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod() {
    io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAllMedicalEventRequest, PatientServicesOuterClass.GetAllMedicalEventResponse> getGetAllMedicalEventMethod;
    if ((getGetAllMedicalEventMethod = PatientServicesGrpc.getGetAllMedicalEventMethod) == null) {
      synchronized (PatientServicesGrpc.class) {
        if ((getGetAllMedicalEventMethod = PatientServicesGrpc.getGetAllMedicalEventMethod) == null) {
          PatientServicesGrpc.getGetAllMedicalEventMethod = getGetAllMedicalEventMethod =
              io.grpc.MethodDescriptor.<PatientServicesOuterClass.GetAllMedicalEventRequest, PatientServicesOuterClass.GetAllMedicalEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMedicalEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetAllMedicalEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetAllMedicalEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServicesMethodDescriptorSupplier("GetAllMedicalEvent"))
              .build();
        }
      }
    }
    return getGetAllMedicalEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAllMedicalExamRequest,
      PatientServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMedicalExam",
      requestType = PatientServicesOuterClass.GetAllMedicalExamRequest.class,
      responseType = PatientServicesOuterClass.GetAllMedicalExamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAllMedicalExamRequest,
      PatientServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod() {
    io.grpc.MethodDescriptor<PatientServicesOuterClass.GetAllMedicalExamRequest, PatientServicesOuterClass.GetAllMedicalExamResponse> getGetAllMedicalExamMethod;
    if ((getGetAllMedicalExamMethod = PatientServicesGrpc.getGetAllMedicalExamMethod) == null) {
      synchronized (PatientServicesGrpc.class) {
        if ((getGetAllMedicalExamMethod = PatientServicesGrpc.getGetAllMedicalExamMethod) == null) {
          PatientServicesGrpc.getGetAllMedicalExamMethod = getGetAllMedicalExamMethod =
              io.grpc.MethodDescriptor.<PatientServicesOuterClass.GetAllMedicalExamRequest, PatientServicesOuterClass.GetAllMedicalExamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllMedicalExam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetAllMedicalExamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetAllMedicalExamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServicesMethodDescriptorSupplier("GetAllMedicalExam"))
              .build();
        }
      }
    }
    return getGetAllMedicalExamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      PatientServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMedicalExamDetails",
      requestType = MedicalExamOuterClass.MedicalExam.class,
      responseType = PatientServicesOuterClass.GetMedicalExamDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam,
      PatientServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod() {
    io.grpc.MethodDescriptor<MedicalExamOuterClass.MedicalExam, PatientServicesOuterClass.GetMedicalExamDetailsResponse> getGetMedicalExamDetailsMethod;
    if ((getGetMedicalExamDetailsMethod = PatientServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
      synchronized (PatientServicesGrpc.class) {
        if ((getGetMedicalExamDetailsMethod = PatientServicesGrpc.getGetMedicalExamDetailsMethod) == null) {
          PatientServicesGrpc.getGetMedicalExamDetailsMethod = getGetMedicalExamDetailsMethod =
              io.grpc.MethodDescriptor.<MedicalExamOuterClass.MedicalExam, PatientServicesOuterClass.GetMedicalExamDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMedicalExamDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MedicalExamOuterClass.MedicalExam.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PatientServicesOuterClass.GetMedicalExamDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServicesMethodDescriptorSupplier("GetMedicalExamDetails"))
              .build();
        }
      }
    }
    return getGetMedicalExamDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServicesStub>() {
        @java.lang.Override
        public PatientServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServicesStub(channel, callOptions);
        }
      };
    return PatientServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServicesBlockingStub>() {
        @java.lang.Override
        public PatientServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServicesBlockingStub(channel, callOptions);
        }
      };
    return PatientServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServicesFutureStub>() {
        @java.lang.Override
        public PatientServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServicesFutureStub(channel, callOptions);
        }
      };
    return PatientServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    default void getPatient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Patient> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    default void getAppointments(PatientServicesOuterClass.GetAppointmentsRequest request,
                                 io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all medical information
     * </pre>
     */
    default void getAllMedicalInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMedicalInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve all medical events
     * </pre>
     */
    default void getAllMedicalEvent(PatientServicesOuterClass.GetAllMedicalEventRequest request,
                                    io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAllMedicalEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMedicalEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    default void getAllMedicalExam(PatientServicesOuterClass.GetAllMedicalExamRequest request,
                                   io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMedicalExamMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    default void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request,
                                       io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMedicalExamDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PatientServices.
   */
  public static abstract class PatientServicesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PatientServicesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PatientServices.
   */
  public static final class PatientServicesStub
      extends io.grpc.stub.AbstractAsyncStub<PatientServicesStub> {
    private PatientServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServicesStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    public void getPatient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<UserOuterClass.Patient> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public void getAppointments(PatientServicesOuterClass.GetAppointmentsRequest request,
                                io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAppointmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all medical information
     * </pre>
     */
    public void getAllMedicalInfo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetMedicalInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMedicalInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve all medical events
     * </pre>
     */
    public void getAllMedicalEvent(PatientServicesOuterClass.GetAllMedicalEventRequest request,
                                   io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAllMedicalEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMedicalEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public void getAllMedicalExam(PatientServicesOuterClass.GetAllMedicalExamRequest request,
                                  io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAllMedicalExamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMedicalExamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public void getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request,
                                      io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetMedicalExamDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PatientServices.
   */
  public static final class PatientServicesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PatientServicesBlockingStub> {
    private PatientServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServicesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    public UserOuterClass.Patient getPatient(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public PatientServicesOuterClass.GetAppointmentsResponse getAppointments(PatientServicesOuterClass.GetAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all medical information
     * </pre>
     */
    public PatientServicesOuterClass.GetMedicalInfoResponse getAllMedicalInfo(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMedicalInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve all medical events
     * </pre>
     */
    public PatientServicesOuterClass.GetAllMedicalEventResponse getAllMedicalEvent(PatientServicesOuterClass.GetAllMedicalEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMedicalEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public PatientServicesOuterClass.GetAllMedicalExamResponse getAllMedicalExam(PatientServicesOuterClass.GetAllMedicalExamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMedicalExamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public PatientServicesOuterClass.GetMedicalExamDetailsResponse getMedicalExamDetails(MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMedicalExamDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PatientServices.
   */
  public static final class PatientServicesFutureStub
      extends io.grpc.stub.AbstractFutureStub<PatientServicesFutureStub> {
    private PatientServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServicesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get Patient data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<UserOuterClass.Patient> getPatient(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a list of appointments
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PatientServicesOuterClass.GetAppointmentsResponse> getAppointments(
        PatientServicesOuterClass.GetAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all medical information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PatientServicesOuterClass.GetMedicalInfoResponse> getAllMedicalInfo(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMedicalInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve all medical events
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PatientServicesOuterClass.GetAllMedicalEventResponse> getAllMedicalEvent(
        PatientServicesOuterClass.GetAllMedicalEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMedicalEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the list of all medical exams without the medical report
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PatientServicesOuterClass.GetAllMedicalExamResponse> getAllMedicalExam(
        PatientServicesOuterClass.GetAllMedicalExamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMedicalExamMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details for a specific medical exam
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<PatientServicesOuterClass.GetMedicalExamDetailsResponse> getMedicalExamDetails(
        MedicalExamOuterClass.MedicalExam request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMedicalExamDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PATIENT = 0;
  private static final int METHODID_GET_APPOINTMENTS = 1;
  private static final int METHODID_GET_ALL_MEDICAL_INFO = 2;
  private static final int METHODID_GET_ALL_MEDICAL_EVENT = 3;
  private static final int METHODID_GET_ALL_MEDICAL_EXAM = 4;
  private static final int METHODID_GET_MEDICAL_EXAM_DETAILS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PATIENT:
          serviceImpl.getPatient((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<UserOuterClass.Patient>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS:
          serviceImpl.getAppointments((PatientServicesOuterClass.GetAppointmentsRequest) request,
              (io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAppointmentsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_INFO:
          serviceImpl.getAllMedicalInfo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetMedicalInfoResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_EVENT:
          serviceImpl.getAllMedicalEvent((PatientServicesOuterClass.GetAllMedicalEventRequest) request,
              (io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAllMedicalEventResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MEDICAL_EXAM:
          serviceImpl.getAllMedicalExam((PatientServicesOuterClass.GetAllMedicalExamRequest) request,
              (io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetAllMedicalExamResponse>) responseObserver);
          break;
        case METHODID_GET_MEDICAL_EXAM_DETAILS:
          serviceImpl.getMedicalExamDetails((MedicalExamOuterClass.MedicalExam) request,
              (io.grpc.stub.StreamObserver<PatientServicesOuterClass.GetMedicalExamDetailsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              UserOuterClass.Patient>(
                service, METHODID_GET_PATIENT)))
        .addMethod(
          getGetAppointmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PatientServicesOuterClass.GetAppointmentsRequest,
              PatientServicesOuterClass.GetAppointmentsResponse>(
                service, METHODID_GET_APPOINTMENTS)))
        .addMethod(
          getGetAllMedicalInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              PatientServicesOuterClass.GetMedicalInfoResponse>(
                service, METHODID_GET_ALL_MEDICAL_INFO)))
        .addMethod(
          getGetAllMedicalEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PatientServicesOuterClass.GetAllMedicalEventRequest,
              PatientServicesOuterClass.GetAllMedicalEventResponse>(
                service, METHODID_GET_ALL_MEDICAL_EVENT)))
        .addMethod(
          getGetAllMedicalExamMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PatientServicesOuterClass.GetAllMedicalExamRequest,
              PatientServicesOuterClass.GetAllMedicalExamResponse>(
                service, METHODID_GET_ALL_MEDICAL_EXAM)))
        .addMethod(
          getGetMedicalExamDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              MedicalExamOuterClass.MedicalExam,
              PatientServicesOuterClass.GetMedicalExamDetailsResponse>(
                service, METHODID_GET_MEDICAL_EXAM_DETAILS)))
        .build();
  }

  private static abstract class PatientServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PatientServicesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientServices");
    }
  }

  private static final class PatientServicesFileDescriptorSupplier
      extends PatientServicesBaseDescriptorSupplier {
    PatientServicesFileDescriptorSupplier() {}
  }

  private static final class PatientServicesMethodDescriptorSupplier
      extends PatientServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PatientServicesMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PatientServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientServicesFileDescriptorSupplier())
              .addMethod(getGetPatientMethod())
              .addMethod(getGetAppointmentsMethod())
              .addMethod(getGetAllMedicalInfoMethod())
              .addMethod(getGetAllMedicalEventMethod())
              .addMethod(getGetAllMedicalExamMethod())
              .addMethod(getGetMedicalExamDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
