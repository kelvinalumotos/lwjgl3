/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSwapchainImageOpenGLESKHR {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t image;
 * }}</pre>
 */
public class XrSwapchainImageOpenGLESKHR extends Struct<XrSwapchainImageOpenGLESKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        IMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
    }

    protected XrSwapchainImageOpenGLESKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainImageOpenGLESKHR create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainImageOpenGLESKHR(address, container);
    }

    /**
     * Creates a {@code XrSwapchainImageOpenGLESKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageOpenGLESKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code image} field. */
    @NativeType("uint32_t")
    public int image() { return nimage(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSwapchainImageOpenGLESKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHROpenGLESEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR} value to the {@code type} field. */
    public XrSwapchainImageOpenGLESKHR type$Default() { return type(KHROpenGLESEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrSwapchainImageOpenGLESKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageOpenGLESKHR set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageOpenGLESKHR set(XrSwapchainImageOpenGLESKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageOpenGLESKHR malloc() {
        return new XrSwapchainImageOpenGLESKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageOpenGLESKHR calloc() {
        return new XrSwapchainImageOpenGLESKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageOpenGLESKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainImageOpenGLESKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageOpenGLESKHR} instance for the specified memory address. */
    public static XrSwapchainImageOpenGLESKHR create(long address) {
        return new XrSwapchainImageOpenGLESKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainImageOpenGLESKHR createSafe(long address) {
        return address == NULL ? null : new XrSwapchainImageOpenGLESKHR(address, null);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader} instance to {@code XrSwapchainImageOpenGLESKHR}. */
    public static XrSwapchainImageOpenGLESKHR create(XrSwapchainImageBaseHeader value) {
        return new XrSwapchainImageOpenGLESKHR(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainImageOpenGLESKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainImageOpenGLESKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader.Buffer} instance to {@code XrSwapchainImageOpenGLESKHR.Buffer}. */
    public static XrSwapchainImageOpenGLESKHR.Buffer create(XrSwapchainImageBaseHeader.Buffer value) {
        return new XrSwapchainImageOpenGLESKHR.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageOpenGLESKHR malloc(MemoryStack stack) {
        return new XrSwapchainImageOpenGLESKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainImageOpenGLESKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageOpenGLESKHR calloc(MemoryStack stack) {
        return new XrSwapchainImageOpenGLESKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageOpenGLESKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageOpenGLESKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSwapchainImageOpenGLESKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageOpenGLESKHR.NEXT); }
    /** Unsafe version of {@link #image}. */
    public static int nimage(long struct) { return memGetInt(struct + XrSwapchainImageOpenGLESKHR.IMAGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSwapchainImageOpenGLESKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageOpenGLESKHR.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageOpenGLESKHR} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageOpenGLESKHR, Buffer> implements NativeResource {

        private static final XrSwapchainImageOpenGLESKHR ELEMENT_FACTORY = XrSwapchainImageOpenGLESKHR.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageOpenGLESKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageOpenGLESKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSwapchainImageOpenGLESKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageOpenGLESKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageOpenGLESKHR.nnext(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("uint32_t")
        public int image() { return XrSwapchainImageOpenGLESKHR.nimage(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSwapchainImageOpenGLESKHR.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageOpenGLESKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHROpenGLESEnable#XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR} value to the {@code type} field. */
        public XrSwapchainImageOpenGLESKHR.Buffer type$Default() { return type(KHROpenGLESEnable.XR_TYPE_SWAPCHAIN_IMAGE_OPENGL_ES_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrSwapchainImageOpenGLESKHR.Buffer next(@NativeType("void *") long value) { XrSwapchainImageOpenGLESKHR.nnext(address(), value); return this; }

    }

}