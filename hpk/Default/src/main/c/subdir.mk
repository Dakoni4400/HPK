################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/main/c/CTest.cpp \
../src/main/c/Differentiator.cpp \
../src/main/c/Integrator.cpp \
../src/main/c/wrb_Differentiator.cpp \
../src/main/c/wrb_Integrator.cpp 

C_SRCS += \
../src/main/c/CUnit.c 

OBJS += \
./src/main/c/CTest.o \
./src/main/c/CUnit.o \
./src/main/c/Differentiator.o \
./src/main/c/Integrator.o \
./src/main/c/wrb_Differentiator.o \
./src/main/c/wrb_Integrator.o 

CPP_DEPS += \
./src/main/c/CTest.d \
./src/main/c/Differentiator.d \
./src/main/c/Integrator.d \
./src/main/c/wrb_Differentiator.d \
./src/main/c/wrb_Integrator.d 

C_DEPS += \
./src/main/c/CUnit.d 


# Each subdirectory must supply rules for building sources it contributes
src/main/c/%.o: ../src/main/c/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -I/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/include/darwin -I/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/include -O2 -g -Wall -c -fmessage-length=0 -std=c++11 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

src/main/c/%.o: ../src/main/c/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -O2 -g -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


