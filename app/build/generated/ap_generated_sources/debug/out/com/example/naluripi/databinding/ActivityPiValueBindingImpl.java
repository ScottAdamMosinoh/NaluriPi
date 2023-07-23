package com.example.naluripi.databinding;
import com.example.naluripi.R;
import com.example.naluripi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPiValueBindingImpl extends ActivityPiValueBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvTitle, 1);
        sViewsWithIds.put(R.id.tvPiLabel, 2);
        sViewsWithIds.put(R.id.tvPiValue, 3);
        sViewsWithIds.put(R.id.tvSunCircumferenceLabel, 4);
        sViewsWithIds.put(R.id.tvSunCircumference, 5);
        sViewsWithIds.put(R.id.rvCircumference, 6);
        sViewsWithIds.put(R.id.llBottomFields, 7);
        sViewsWithIds.put(R.id.etName, 8);
        sViewsWithIds.put(R.id.etRadius, 9);
        sViewsWithIds.put(R.id.btnCalculate, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPiValueBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityPiValueBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[9]
            , (android.widget.LinearLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.clRoot.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}