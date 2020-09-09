package com.robelseyoum3.slynccodingchallenge.data.model.posts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0011H\u00c6\u0003J\t\u00101\u001a\u00020\u0013H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\t\u00108\u001a\u00020\u0001H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\fH\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\u009f\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\bH\u00c6\u0001J\u0013\u0010>\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\bH\u00d6\u0001J\t\u0010A\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001e\u00a8\u0006B"}, d2 = {"Lcom/robelseyoum3/slynccodingchallenge/data/model/posts/Post;", "", "boosted", "", "content", "", "guid", "height", "", "job", "liked", "organisation", "Lcom/robelseyoum3/slynccodingchallenge/data/model/posts/Organisation;", "photo1280Url", "photo640Url", "photoUrl", "postType", "Lcom/robelseyoum3/slynccodingchallenge/data/model/posts/PostType;", "posted", "", "videoStillUrl", "videoUrl", "width", "(ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;ZLcom/robelseyoum3/slynccodingchallenge/data/model/posts/Organisation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robelseyoum3/slynccodingchallenge/data/model/posts/PostType;JLjava/lang/String;Ljava/lang/String;I)V", "getBoosted", "()Z", "getContent", "()Ljava/lang/String;", "getGuid", "getHeight", "()I", "getJob", "()Ljava/lang/Object;", "getLiked", "getOrganisation", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/posts/Organisation;", "getPhoto1280Url", "getPhoto640Url", "getPhotoUrl", "getPostType", "()Lcom/robelseyoum3/slynccodingchallenge/data/model/posts/PostType;", "getPosted", "()J", "getVideoStillUrl", "getVideoUrl", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Post {
    @com.google.gson.annotations.SerializedName(value = "boosted")
    private final boolean boosted = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "content")
    private final java.lang.String content = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "guid")
    private final java.lang.String guid = null;
    @com.google.gson.annotations.SerializedName(value = "height")
    private final int height = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "job")
    private final java.lang.Object job = null;
    @com.google.gson.annotations.SerializedName(value = "liked")
    private final boolean liked = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "organisation")
    private final com.robelseyoum3.slynccodingchallenge.data.model.posts.Organisation organisation = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photo1280Url")
    private final java.lang.String photo1280Url = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photo640Url")
    private final java.lang.String photo640Url = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "photoUrl")
    private final java.lang.String photoUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "postType")
    private final com.robelseyoum3.slynccodingchallenge.data.model.posts.PostType postType = null;
    @com.google.gson.annotations.SerializedName(value = "posted")
    private final long posted = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "videoStillUrl")
    private final java.lang.String videoStillUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "videoUrl")
    private final java.lang.String videoUrl = null;
    @com.google.gson.annotations.SerializedName(value = "width")
    private final int width = 0;
    
    public final boolean getBoosted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGuid() {
        return null;
    }
    
    public final int getHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getJob() {
        return null;
    }
    
    public final boolean getLiked() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.posts.Organisation getOrganisation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoto1280Url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoto640Url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.posts.PostType getPostType() {
        return null;
    }
    
    public final long getPosted() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVideoStillUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVideoUrl() {
        return null;
    }
    
    public final int getWidth() {
        return 0;
    }
    
    public Post(boolean boosted, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String guid, int height, @org.jetbrains.annotations.NotNull()
    java.lang.Object job, boolean liked, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.posts.Organisation organisation, @org.jetbrains.annotations.NotNull()
    java.lang.String photo1280Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photo640Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.posts.PostType postType, long posted, @org.jetbrains.annotations.NotNull()
    java.lang.String videoStillUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String videoUrl, int width) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.posts.Organisation component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.posts.PostType component11() {
        return null;
    }
    
    public final long component12() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.robelseyoum3.slynccodingchallenge.data.model.posts.Post copy(boolean boosted, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String guid, int height, @org.jetbrains.annotations.NotNull()
    java.lang.Object job, boolean liked, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.posts.Organisation organisation, @org.jetbrains.annotations.NotNull()
    java.lang.String photo1280Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photo640Url, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl, @org.jetbrains.annotations.NotNull()
    com.robelseyoum3.slynccodingchallenge.data.model.posts.PostType postType, long posted, @org.jetbrains.annotations.NotNull()
    java.lang.String videoStillUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String videoUrl, int width) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}