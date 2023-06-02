package com.assign.openinapp.databinding;
import com.assign.openinapp.R;
import com.assign.openinapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(24);
        sIncludes.setIncludes(1, 
            new String[] {"item_top_card", "item_top_card", "item_top_card", "item_top_card"},
            new int[] {2, 3, 4, 5},
            new int[] {com.assign.openinapp.R.layout.item_top_card,
                com.assign.openinapp.R.layout.item_top_card,
                com.assign.openinapp.R.layout.item_top_card,
                com.assign.openinapp.R.layout.item_top_card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_dashboard, 6);
        sViewsWithIds.put(R.id.button_settings, 7);
        sViewsWithIds.put(R.id.constraint_layout, 8);
        sViewsWithIds.put(R.id.greeting, 9);
        sViewsWithIds.put(R.id.name, 10);
        sViewsWithIds.put(R.id.graphView, 11);
        sViewsWithIds.put(R.id.tv_overview, 12);
        sViewsWithIds.put(R.id.graphViewHolder, 13);
        sViewsWithIds.put(R.id.tv_period, 14);
        sViewsWithIds.put(R.id.horizontal_scrollview, 15);
        sViewsWithIds.put(R.id.view_analytics, 16);
        sViewsWithIds.put(R.id.heading_top_links, 17);
        sViewsWithIds.put(R.id.heading_recent_links, 18);
        sViewsWithIds.put(R.id.button_search, 19);
        sViewsWithIds.put(R.id.recycler_view_links, 20);
        sViewsWithIds.put(R.id.view_all_links, 21);
        sViewsWithIds.put(R.id.cardview_whatsapp, 22);
        sViewsWithIds.put(R.id.cardview_faq, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.assign.openinapp.databinding.ItemTopCardBinding) bindings[5]
            , (android.widget.ImageButton) bindings[19]
            , (android.widget.ImageButton) bindings[7]
            , (com.google.android.material.card.MaterialCardView) bindings[23]
            , (com.google.android.material.card.MaterialCardView) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (com.google.android.material.card.MaterialCardView) bindings[11]
            , (com.github.mikephil.charting.charts.LineChart) bindings[13]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.HorizontalScrollView) bindings[15]
            , (android.widget.TextView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (com.assign.openinapp.databinding.ItemTopCardBinding) bindings[2]
            , (com.assign.openinapp.databinding.ItemTopCardBinding) bindings[3]
            , (com.assign.openinapp.databinding.ItemTopCardBinding) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (com.google.android.material.button.MaterialButton) bindings[21]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            );
        setContainedBinding(this.bestTimeParent);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.todaysClicksParent);
        setContainedBinding(this.topLocationParent);
        setContainedBinding(this.topSourceParent);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        todaysClicksParent.invalidateAll();
        topLocationParent.invalidateAll();
        topSourceParent.invalidateAll();
        bestTimeParent.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (todaysClicksParent.hasPendingBindings()) {
            return true;
        }
        if (topLocationParent.hasPendingBindings()) {
            return true;
        }
        if (topSourceParent.hasPendingBindings()) {
            return true;
        }
        if (bestTimeParent.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        todaysClicksParent.setLifecycleOwner(lifecycleOwner);
        topLocationParent.setLifecycleOwner(lifecycleOwner);
        topSourceParent.setLifecycleOwner(lifecycleOwner);
        bestTimeParent.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBestTimeParent((com.assign.openinapp.databinding.ItemTopCardBinding) object, fieldId);
            case 1 :
                return onChangeTodaysClicksParent((com.assign.openinapp.databinding.ItemTopCardBinding) object, fieldId);
            case 2 :
                return onChangeTopSourceParent((com.assign.openinapp.databinding.ItemTopCardBinding) object, fieldId);
            case 3 :
                return onChangeTopLocationParent((com.assign.openinapp.databinding.ItemTopCardBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBestTimeParent(com.assign.openinapp.databinding.ItemTopCardBinding BestTimeParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTodaysClicksParent(com.assign.openinapp.databinding.ItemTopCardBinding TodaysClicksParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTopSourceParent(com.assign.openinapp.databinding.ItemTopCardBinding TopSourceParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTopLocationParent(com.assign.openinapp.databinding.ItemTopCardBinding TopLocationParent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.bestTimeParent.setOption(getRoot().getResources().getString(R.string.best_time));
            this.todaysClicksParent.setOption(getRoot().getResources().getString(R.string.todays_clicks));
            this.topLocationParent.setOption(getRoot().getResources().getString(R.string.top_location));
            this.topSourceParent.setOption(getRoot().getResources().getString(R.string.top_source));
        }
        executeBindingsOn(todaysClicksParent);
        executeBindingsOn(topLocationParent);
        executeBindingsOn(topSourceParent);
        executeBindingsOn(bestTimeParent);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bestTimeParent
        flag 1 (0x2L): todaysClicksParent
        flag 2 (0x3L): topSourceParent
        flag 3 (0x4L): topLocationParent
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}