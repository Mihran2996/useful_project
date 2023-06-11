package com.example.streamApi.Maven.jvm.memory;

public class Main {

    //JVM architecture?
    //JVM architecture in Java contains CLASSLOADER, MEMORY AREA, EXECUTION ENGINE etc.

    //1) CLASSLOADER****************************************************************************************************
    //The class loader is a subsystem used for loading class files. It performs three major function viz.
    //LOADING, LINKING, and INITIALIZATION.

    //2) METHOD AREA (METASPACE)****************************************************************************************
    //JVM Method Area stores class structures like metadata, the constant runtime pool, and the code for methods.

    //3) HEAP***********************************************************************************************************
    //All the Objects, their related instance variables, and arrays are stored in the heap.
    //This memory is common and shared across multiple threads.

    //4) JVM LANGUAGE STACKS********************************************************************************************
    //Java language Stacks store local variables, and it’s partial results.
    //Each thread has its own JVM stack, created simultaneously as the thread is created.
    //A new frame is created whenever a method is invoked, and it is deleted when method invocation process is complete.

    //5) PC REGISTERS (program counter)--pahume tvyal pahin execute linox threadneri hascener@**************************
    //PC register store the address of the Java virtual machine instruction which is currently executing.
    //In Java, each thread has its separate PC register.

    //6) NATIVE METHOD STACKS*******************************************************************************************
    //Native method stacks hold the instruction of native code depends on the native library.
    //It is written in another language instead of Java.
    //The JVM contains stacks that support native methods. These methods are written in a language other than the Java,
    //such as C and C++. For every new thread, a separate native method stack is also allocated.

    //******************************************************************************************************************

    //7) EXECUTION ENGINE***********************************************************************************************
    //Once the bytecode has been loaded into the main memory, and details are available in the runtime data area,
    //the next step is to run the program. The Execution Engine handles this by executing the code present in each class.
    //However, before executing the program, the bytecode needs to be converted into machine language instructions.
    //The JVM can use an interpreter or a JIT compiler for the execution engine

    //INTERPRETER
    //The interpreter reads and executes the bytecode instructions line by line.
    //Due to the line by line execution, the interpreter is comparatively slower.
    //Another disadvantage of the interpreter is that when a method is called multiple times,
    //every time a new interpretation is required.

    //GIT COMPILER
    //The JIT Compiler overcomes the disadvantage of the interpreter.
    //The Execution Engine first uses the interpreter to execute the byte code,
    //but when it finds some repeated code, it uses the JIT compiler.
    //The JIT compiler then compiles the entire bytecode and changes it to native machine code.
    //This native machine code is used directly for repeated method calls, which improves the performance of the system.

    //To better understand the difference between interpreter and JIT compiler, assume that you have the following code:
    //*******************************************
    //int sum = 10;
    //for(int i = 0 ; i <= 10; i++) {
    //   sum += i;
    //}
    //System.out.println(sum);
    //*******************************************
    //
    //Interpreter-@ amen iteraciayi jamanak sum-i valuen vercnume memory-ic, i-i valeun add e anym sum-in ev het grum memory -i mej
    //sa shat caxsatar gorcoxutyune qani vor amen iteraciayi jamanak memory-ic kardacvum ev grvume sum-i arjeq@
    //JiT COMPILER-@ optimizacnume ays gorcoxutyun@
    //Jit@ kstexci sum-i local copy-n ev store kani PC Register-i mej, sum-in add kani i-i valuen loopi mej,
    //loopi avartveluc heto jit@ sum-i  valuen kgri memeory mej,ayspisov mek angamenq grum memory-i mej

    //THE JIT COMPILER HAS THE FOLLOWING COMPONENTS:

    //1) INTERMEDIATE CODE GENERATOR - generates intermediate code
    //2) CODE OPTIMIZER - optimizes the intermediate code for better performance
    //3) TARGET CODE GENERATOR - converts intermediate code to native machine code
    //4) PROFILER - finds the hotspots (code that is executed repeatedly)

    //Note:
    //a JIT compiler takes more time to compile the code than for the interpreter to interpret the code line by line.
    //If you are going to run a program only once, using the interpreter is better.
    //******************************************************************************************************************



}
